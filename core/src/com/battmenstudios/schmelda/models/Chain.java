package com.battmenstudios.schmelda.models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Array;
import com.battmenstudios.schmelda.Schmelda;
import com.battmenstudios.schmelda.screens.PlayScreen;

import static com.battmenstudios.schmelda.models.Chain.State.IDLE;


/**
 * Created by benvi on 4/11/2017.
 */

public class Chain extends Sprite{
    public enum State {LEFT, RIGHT, UP, DOWN, IDLE}
    public State currentState = IDLE;
    public State previousState = IDLE;
    private Texture texture;

    //Define Physics Body
    private World world;
    private Body b2body;

    //Default Movement Speed
    private float movementSpeed = Schmelda.DEFAULT_MOVEMENT_SPEED;

    //handle Joystick Control
    private float inputVelocityX;
    private float inputVelocityY;

    //Animations
    private Animation chainWalkLeft;
    private float elapsedTime = 0;


    public Chain(int x, int y, PlayScreen screen) {
        this.world = screen.getWorld();
        texture = new Texture("characters/chain/chain.png");

        Array<TextureRegion> frames = new Array<TextureRegion>();

        //get run animation frames and add them to marioRun Animation
        for(int i = 1; i < 7; i++) {
            frames.add(new TextureRegion(screen.getAtlas().findRegion("chain_left"), i * 64, 0, 64, 64));
        }
        chainWalkLeft = new Animation(0.1f, frames);



        defineChain(x, y);
    }

    public void update(float dt) {
        setVelocity();
    }

    public void setVelocity() {
        //determine velocity based off of input and environmental effects
        currentState = getState();
        this.b2body.setLinearVelocity(this.inputVelocityX * movementSpeed, this.inputVelocityY * movementSpeed);
    }

//    public TextureRegion getTexture() {
//        elapsedTime += Gdx.graphics.getDeltaTime();
//
//        return frames.get(0);
//    }
//


    public void defineChain(int x, int y) {
        BodyDef bdef = new BodyDef();
        bdef.position.set(x / Schmelda.PPM , y / Schmelda.PPM);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body = world.createBody(bdef);

        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();
        shape.setRadius(6 / Schmelda.PPM);

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

    public State getState() {
        float x =  inputVelocityX * 100;
        float y =  inputVelocityY * 100;
        double test = 1.5 * Math.PI - Math.atan2(y * 10, x * 10);
        System.out.println(x + " }} " + y);

//        if (x > 10 && y > 10) {
//            return RIGHT;
//        } else if (x > 0.3 && y < -0.3) {
//            return DOWN;
//        } else if (x > 0.3 && y > 0) {
//
//        } else if (x > 0.3 && y > 0) {
//
//        }
        return currentState;
    }

    public void setInputVelocity(float inputVelocityX, float inputVelocityY) {
        this.inputVelocityX = inputVelocityX;
        this.inputVelocityY = inputVelocityY;
    }
}
