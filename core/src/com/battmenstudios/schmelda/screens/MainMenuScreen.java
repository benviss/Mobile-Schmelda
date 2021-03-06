package com.battmenstudios.schmelda.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.battmenstudios.schmelda.Schmelda;

/**
 * Created by benvi on 4/10/2017.
 */

public class MainMenuScreen implements Screen{
    private Texture background;
    private Texture playBtn;
    private Schmelda game;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private World world;
    private boolean alreadyClicked = false;

    ParticleEffect flameLeft;
    ParticleEffect flameRight;

    public MainMenuScreen(Schmelda game) {
        this.game = game;

        //Camera Position
        gamecam = new OrthographicCamera();
        gamecam.setToOrtho(false, Schmelda.WIDTH, Schmelda.HEIGHT);

        //Background Texture
        background = new Texture("landscapes/bg.png");
        playBtn = new Texture("characters/chain/chain.png");

        //Particle Generation
        flameLeft = new ParticleEffect();
        flameLeft.load(Gdx.files.internal("particles/flame_1"), Gdx.files.internal("particles/"));
        flameLeft.getEmitters().first().setPosition(Gdx.graphics.getWidth()/4 - 150, Gdx.graphics.getHeight()/4 - 100);
        flameLeft.start();

        flameRight = new ParticleEffect();
        flameRight.load(Gdx.files.internal("particles/flame_1"), Gdx.files.internal("particles/"));
        flameRight.getEmitters().first().setPosition(Gdx.graphics.getWidth()/4 + 150, Gdx.graphics.getHeight()/4 - 100);
        flameRight.start();
        gamecam.position.set(Schmelda.WIDTH / 2, Schmelda.HEIGHT / 2, 0);
        gamecam.update();

    }

    public void handleInput() {

        if (Gdx.input.justTouched() && !alreadyClicked) {
            game.setScreen(new PlayScreen(game));
            alreadyClicked = true;

            dispose();
        }
    }

    public void update(float dt) {
        handleInput();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float dt) {
        update(dt);

        game.batch.setProjectionMatrix(gamecam.combined);

        flameLeft.update(Gdx.graphics.getDeltaTime());
        flameRight.update(Gdx.graphics.getDeltaTime());

        game.batch.begin();

        game.batch.draw(background, 0, 0,Schmelda.WIDTH, Schmelda.HEIGHT);
        game.batch.draw(playBtn, gamecam.position.x - playBtn.getWidth() / 2, gamecam.position.y);

        flameLeft.draw(game.batch);
        flameRight.draw(game.batch);


        game.batch.end();

        if(flameLeft.isComplete())
            flameLeft.reset();
        if(flameRight.isComplete())
            flameRight.reset();
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
        flameLeft.dispose();
        flameRight.dispose();
        background.dispose();
        playBtn.dispose();
    }


}
