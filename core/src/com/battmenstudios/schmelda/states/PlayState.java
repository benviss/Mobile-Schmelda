package com.battmenstudios.schmelda.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.battmenstudios.schmelda.Schmelda;
import com.battmenstudios.schmelda.constants.Level;
import com.battmenstudios.schmelda.models.Obstacle;
import com.battmenstudios.schmelda.models.sprites.Chain;

import java.util.ArrayList;

/**
 * Created by benvi on 4/10/2017.
 */

public class PlayState extends State {
    public Chain chain;
    private Texture levelGround;
    public ArrayList<Obstacle> models;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        models = Level.generateLevel(1);
        levelGround = new Texture("landscapes/grass.png");
        chain = new Chain(200, 50);
        cam.setToOrtho(false, Schmelda.WIDTH / 2, Schmelda.HEIGHT / 2);
    }

    @Override
    protected void handleInput() {
        chain.setVelocity(0, 0);
        int x = 0;
        int y = 0;
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            y = 2;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            x = -2;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            x = 2;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            y = -2;
        }
        chain.setVelocity(x, y);
    }

    @Override
    public void update(float dt) {
        handleInput();
        chain.update(dt);


    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.setProjectionMatrix(cam.combined);
        for (int y = 16; y < Schmelda.HEIGHT; y+=16) {
            for (int x = 0; x < Schmelda.WIDTH; x+=16) {
                sb.draw(levelGround, x, y, 16, 16);
            }
        }
        for (Obstacle o : models) {
            sb.draw(o.getImageTexture(), o.getX(), o.getY(), 16, 16);
        }
        sb.draw(chain.getTexture(), chain.getPosition().x, chain.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
