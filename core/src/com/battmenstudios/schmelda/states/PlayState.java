package com.battmenstudios.schmelda.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.battmenstudios.schmelda.Schmelda;
import com.battmenstudios.schmelda.constants.Level;
import com.battmenstudios.schmelda.sprites.Chain;
import com.battmenstudios.schmelda.tools.B2WorldCreator;

/**
 * Created by benvi on 4/10/2017.
 */

public class PlayState extends State {
    public Chain chain;

    //TiledMapVariables
    public TiledMap map;
    private TiledMapRenderer renderer;
    public int[] background;
    public int[] foreground;

    //Box2D Variables
    private World world;
    private Box2DDebugRenderer b2dr;
    private B2WorldCreator creator;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        map = Level.getLevel(1);
        cam.setToOrtho(false, Schmelda.WIDTH / 2, Schmelda.HEIGHT / 2);
        background = new int[] {0, 1, 2, 3};
        foreground = new int[] {4};
        renderer = new OrthogonalTiledMapRenderer(map);

        //Create World
        world = new World(new Vector2(0, 0), true);
        //allows for debugging lines of box2d
        b2dr = new Box2DDebugRenderer();

//        creator = new B2WorldCreator(this);
        chain = new Chain(200, 150, this);

        BodyDef bdef = new BodyDef();
        PolygonShape shape = new PolygonShape();
        FixtureDef fdef = new FixtureDef();
        Body body;

        //Construct World Barriers
        for (MapObject object : map.getLayers().get(5).getObjects().getByType(RectangleMapObject.class)) {
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set((rect.getX() + rect.getWidth() / 2), (rect.getY() + rect.getHeight() / 2));

            body = world.createBody(bdef);

            shape.setAsBox(rect.getWidth() / 2, rect.getHeight() / 2);
            fdef.shape = shape;
            body.createFixture(fdef);
        }
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
        chain.update(dt);

        world.step(1 / 60f, 6, 2);
        cam.position.x = chain.getB2body().getPosition().x;
        cam.position.y = chain.getB2body().getPosition().y;
        cam.update();
    }

    @Override
    public void render(SpriteBatch sb) {
        renderer.render(background);
        renderer.setView(cam);
        sb.begin();
        sb.setProjectionMatrix(cam.combined);
        chain.draw(sb);
        sb.end();
        renderer.render(foreground);

        b2dr.render(world, cam.combined);

    }

    @Override
    public void dispose() {
        map.dispose();
    }

    public TiledMap getMap() {
        return map;
    }

    public World getWorld() {
        return world;
    }
}
