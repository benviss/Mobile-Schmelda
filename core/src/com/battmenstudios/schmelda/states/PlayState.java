package com.battmenstudios.schmelda.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.battmenstudios.schmelda.Schmelda;
import com.battmenstudios.schmelda.constants.Level;
import com.battmenstudios.schmelda.models.Obstacle;

import java.util.ArrayList;

/**
 * Created by benvi on 4/10/2017.
 */

public class PlayState extends State {
    private Texture chain;
    private Texture model;
    private Texture levelGround;
    public ArrayList<Obstacle> models;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        models = Level.generateLevel(1);
        levelGround = new Texture("landscapes/grass.png");
        chain = new Texture("chain.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        for (int y = 16; y < Schmelda.HEIGHT; y+=16) {
            for (int x = 0; x < Schmelda.WIDTH; x+=16) {
                sb.draw(levelGround, x, y, 16, 16);
            }
        }
        for (Obstacle o : models) {
            sb.draw(o.getImageTexture(), o.getX(), o.getY(), 16, 16);
        }
        sb.draw(chain, 50, 50);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
