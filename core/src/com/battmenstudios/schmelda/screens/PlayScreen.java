package com.battmenstudios.schmelda.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.battmenstudios.schmelda.Schmelda;
import com.battmenstudios.schmelda.constants.Level;
import com.battmenstudios.schmelda.sprites.Chain;
import com.battmenstudios.schmelda.tools.B2WorldCreator;

/**
 * Created by benvi on 4/10/2017.
 */

public class PlayScreen implements Screen {
    //Game references
    private Schmelda game;

    public Chain chain;

    //CameraVariables
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    //   TODO private Hud hud;

    //TiledMapVariables
    public TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    public int[] background;
    public int[] foreground;

    //Box2D Variables
    private World world;
    private Box2DDebugRenderer b2dr;
    private B2WorldCreator creator;

    public PlayScreen(Schmelda game) {
        this.game = game;

        //Camera to follow chain
        gamecam = new OrthographicCamera();
        gamecam.setToOrtho(false, Schmelda.WIDTH / 2, Schmelda.HEIGHT / 2);
        gamePort = new FitViewport(Schmelda.WIDTH, Schmelda.HEIGHT, gamecam);

        //Map generation and renderer
        map = Level.getLevel(1);
        background = new int[] {0, 1, 2, 3};
        foreground = new int[] {4};
        renderer = new OrthogonalTiledMapRenderer(map);

        //Initially centers gamecam position
        gamecam.position.set(gamePort.getWorldWidth(), gamePort.getWorldHeight(), 0);


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

    public void handleInput() {

    }

    public void update(float dt) {
        handleInput();
        chain.update(dt);

        world.step(1 / 60f, 6, 2);
        gamecam.position.x = chain.getB2body().getPosition().x;
        gamecam.position.y = chain.getB2body().getPosition().y;
        gamecam.update();

        renderer.setView(gamecam);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float dt) {
        update(dt);

        //Clear screen to black before every render
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        renderer.render(background);
        b2dr.render(world, gamecam.combined);
        game.batch.setProjectionMatrix(gamecam.combined);

        game.batch.begin();
//        chain.draw(game.batch);
        game.batch.end();

        renderer.render(foreground);

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        map.dispose();
        renderer.dispose();
        world.dispose();
        b2dr.dispose();

    }

    public TiledMap getMap() {
        return map;
    }

    public World getWorld() {
        return world;
    }
}
