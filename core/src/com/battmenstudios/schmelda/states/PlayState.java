package com.battmenstudios.schmelda.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.battmenstudios.schmelda.constants.Level;
import com.battmenstudios.schmelda.models.Obstacle;

import java.util.ArrayList;

/**
 * Created by benvi on 4/10/2017.
 */

public class PlayState extends State {
    private Texture chain;
    private Texture model;
    public ArrayList<Obstacle> models;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        models = Level.generateLevel(1);
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
