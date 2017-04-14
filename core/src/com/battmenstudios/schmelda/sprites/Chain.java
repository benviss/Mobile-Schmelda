package com.battmenstudios.schmelda.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import com.battmenstudios.schmelda.Schmelda;
import com.battmenstudios.schmelda.screens.PlayScreen;


/**
 * Created by benvi on 4/11/2017.
 */

public class Chain extends Sprite{
    private Animation walkAnimation;
    private Texture texture;

    public World world;
    public Body b2body;

    private float movementSpeed = Schmelda.DEFAULT_MOVEMENT_SPEED;

    public Chain(int x, int y, PlayScreen state) {
        this.world = state.getWorld();
        texture = new Texture("characters/chain/chain.png");
        walkAnimation = new Animation(new TextureRegion(texture), 9, 0.5f);

        defineChain(x, y);
    }

    public void update(float dt) {
        handleInput();
//        velocity.scl(dt);
        walkAnimation.update(dt);
//        position.add(velocity.x, velocity.y, 0);
//        velocity.scl(dt);

//        redefineChain((int) position.x,(int) position.y);
    }

    public void handleInput() {
        float x = 0;
        float y = 0;
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            y += movementSpeed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            x -= movementSpeed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            x += movementSpeed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            y -= movementSpeed;
        }
        this.b2body.setLinearVelocity(x, y);
////        redefineChain((int) x, (int)y);
    }

    public void draw(SpriteBatch sb) {
//        sb.draw(texture, this.b2body.getPosition().x - getWidth() / 2 / 2, this.b2body.getPosition().y - getHeight() / 2 / 2, texture.getWidth() / 2, getHeight() / 2);
        sb.draw(texture, this.b2body.getPosition().x - getWidth() / 2, this.b2body.getPosition().y - getHeight() / 2);
    }

    public void defineChain(int x, int y) {
        BodyDef bdef = new BodyDef();
        bdef.position.set(x, y);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body = world.createBody(bdef);

        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();
        shape.setRadius(6);

        fdef.shape = shape;
        b2body.createFixture(fdef).setUserData(this);

        b2body.createFixture(fdef).setUserData(this);
    }

    public void redefineChain(int x, int y) {
        world.destroyBody(b2body);
        BodyDef bdef = new BodyDef();
        bdef.position.set(x, y);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body = world.createBody(bdef);

        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();
        shape.setRadius(6);

        fdef.shape = shape;
        b2body.createFixture(fdef).setUserData(this);

        b2body.createFixture(fdef).setUserData(this);
    }

    public Body getB2body() {
        return b2body;
    }

    public float getMovementSpeed() {
        return movementSpeed;
    }
}
