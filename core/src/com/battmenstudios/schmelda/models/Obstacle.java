package com.battmenstudios.schmelda.models;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by benvi on 4/10/2017.
 */

public class Obstacle {
    int x;
    int y;
    String image;
    Texture imageTexture;

    public Obstacle(int x, int y, char type) {
        this.x = x;
        this.y = y;
        if (type == '#') {
            image = "landscapes/rock.png";
        } else if (type == 'g') {
            image = "landscapes/rock-bottom.png";
        } else if (type == 'c') {
            image = "landscapes/rock-right.png";
        } else if (type == 'h') {
            image = "landscapes/rock-top.png";
        } else if (type == 'l') {
            image = "landscapes/rock-left.png";
        } else if (type == 'r') {
            image = "landscapes/rock-bottom-cri.png";
        } else if (type == 's') {
            image = "landscapes/rock-bottom-cli.png";
        } else if (type == 'a') {
            image = "landscapes/rock-top-cri.png";
        } else if (type == 'b') {
            image = "landscapes/rock-top-cli.png";
        } else if (type == 'u') {
            image = "landscapes/rock-top-clo.png";
        } else if (type == 'p') {
            image = "landscapes/rock-bottom-cro.png";
        } else if (type == 'y') {
            image = "landscapes/rock-bottom-clo.png";
        } else if (type == 'v') {
            image = "landscapes/rock-top-cro.png";
        }
        imageTexture = new Texture(image);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getImage() {
        return image;
    }

    public Texture getImageTexture() {
        return imageTexture;
    }
}
