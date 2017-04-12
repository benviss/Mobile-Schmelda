package com.battmenstudios.schmelda.models.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by benvi on 4/11/2017.
 */

public abstract class Sprite {
    public Vector3 position;
    public Vector3 velocity;
    public Texture texture;

    protected Sprite(int x, int y) {
        position = new Vector3(x,y,0);
        velocity = new Vector3(0, 0, 0);
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setVelocity(int x, int y) {
        this.velocity = new Vector3(x, y, 0);
    }

    public void setPosition(int x, int y) {
        this.position = new Vector3(x, y, 0);
    }
}
