package com.battmenstudios.schmelda.models.sprites;

import com.badlogic.gdx.graphics.Texture;


/**
 * Created by benvi on 4/11/2017.
 */

public class Chain extends Sprite {

    public Chain(int x, int y) {
        super(x, y);
        texture = new Texture("chain.png");
    }

    public void update(float dt) {
//        velocity.scl(dt);
        position.add(velocity.x, velocity.y, 0);

        velocity.scl(dt);
    }
}
