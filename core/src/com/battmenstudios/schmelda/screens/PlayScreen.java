package com.battmenstudios.schmelda.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.battmenstudios.schmelda.Schmelda;
import com.battmenstudios.schmelda.constants.Level;
import com.battmenstudios.schmelda.models.Chain;
import com.battmenstudios.schmelda.scenes.Hud;
import com.battmenstudios.schmelda.tools.B2WorldCreator;
import com.battmenstudios.schmelda.tools.PlayerController;

/**
 * Created by benvi on 4/10/2017.
 */

public class PlayScreen implements Screen {
    //Game references
    private Schmelda game;

    //Chain Gang
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

    //HUD Display
    private Hud hud;

    //For Touch Processing
    private PlayerController playerController;

    //Animations Atlas
    private TextureAtlas atlas;

    public PlayScreen(Schmelda game) {
        atlas = new TextureAtlas("characters/chain/chain_animations.pack");

        this.game = game;

        //Camera to follow chain
        gamecam = new OrthographicCamera();
        gamecam.setToOrtho(false, Schmelda.WIDTH / Schmelda.PPM / 5, Schmelda.HEIGHT / Schmelda.PPM / 5);

        gamePort = new FitViewport(16,9,gamecam);


        //Map generation and renderer
        map = Level.getLevel(1);
        background = new int[] {0, 1, 2, 3};
        foreground = new int[] {4};
        renderer = new OrthogonalTiledMapRenderer(map, 1 / Schmelda.PPM);

        //Generates HUD display
        hud = new Hud(game.batch);

        //Initially centers gamecam position


        //Create World
        world = new World(new Vector2(0, 0), true);
        //allows for debugging lines of box2d
        b2dr = new Box2DDebugRenderer();
        //create world collision
        creator = new B2WorldCreator(this);

        //Create Play Joystick
        playerController = new PlayerController(game);

        chain = new Chain(6200, 6200, this);

    }

    public void handleInput(float dt) {
        if (Gdx.input.justTouched()) {
            hud.update(dt);
        }


//        switch (Gdx.app.getType()) {
//            case Android:
                chain.setInputVelocity(playerController.getTouchpad().getKnobPercentX(),playerController.getTouchpad().getKnobPercentY());
//                break;
//            case Desktop:
//                float x = 0;
//                float y = 0;
//                if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
//                    y += 1;
//                }
//                if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
//                    x -= 1;
//                }
//                if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
//                    x += 1;
//                }
//                if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
//                    y -= 1;
//                }
//                chain.setInputVelocity(x, y);
//                break;
//        }
    }


    public void update(float dt) {
        handleInput(dt);
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

//        game.batch.begin();
//        game.batch.draw(chain.getTexture(), chain.getB2body().getPosition().x - 16 / Schmelda.PPM, chain.getB2body().getPosition().y - 8 / Schmelda.PPM, 32 / Schmelda.PPM, 32 / Schmelda.PPM);
//        game.batch.end();

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.update(dt);
        hud.stage.draw();

        renderer.render(foreground);

        playerController.draw();

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
        hud.dispose();
    }

    public TiledMap getMap() {
        return map;
    }

    public World getWorld() {
        return world;
    }

    public TextureAtlas getAtlas() {
        return atlas;
    }
}
