package com.battmenstudios.schmelda.tools;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad.TouchpadStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.battmenstudios.schmelda.Schmelda;

/**
 * Created by benvi on 4/17/2017.
 */

public class PlayerController  {
    private Schmelda game;
    private Stage stage;
    private Viewport viewport;
    public Touchpad touchpad;
    public Touchpad.TouchpadStyle touchpadStyle;
    private Skin touchpadSkin;
    private Drawable touchBackground;
    private Drawable touchKnob;
    private Texture blockTexture;
    private Sprite blockSprite;
    private float blockSpeed;

    public PlayerController(Schmelda game) {
        this.game = game;

        OrthographicCamera camera = new OrthographicCamera(Schmelda.WIDTH, Schmelda.HEIGHT);
        camera.translate(Schmelda.WIDTH, Schmelda.HEIGHT, 0);
        camera.update();

        viewport = new ScreenViewport(camera);
        viewport.apply();

        stage = new Stage(viewport, game.batch);

        //Create a touchpad skin
        touchpadSkin = new Skin();
        //Set background image
        touchpadSkin.add("touch_background", new Texture("ui_textures/touch_background.png"));
        //Set knob image
        touchpadSkin.add("touch_knob", new Texture("ui_textures/touch_knob.png"));
        //Create TouchPad Style
        touchpadStyle = new TouchpadStyle();
        //Create Drawable's from TouchPad skin
        touchBackground = touchpadSkin.getDrawable("touch_background");
        touchKnob = touchpadSkin.getDrawable("touch_knob");
        //Apply the Drawables to the TouchPad Style
        touchpadStyle.background = touchBackground;
        touchpadStyle.knob = touchKnob;

        touchpadStyle.knob.setMinHeight(Schmelda.HEIGHT / 6);
        touchpadStyle.knob.setMinWidth(Schmelda.HEIGHT / 6);

        //Create new TouchPad with the created style
        touchpad = new Touchpad(10, touchpadStyle);
        //setBounds(x,y,width,height)
        touchpad.setBounds(15, 15, Schmelda.HEIGHT / 3, Schmelda.HEIGHT / 3);

        //Create a Stage and add TouchPad
//        stage = new Stage(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), true, game.batch);
        stage.addActor(touchpad);
        Gdx.input.setInputProcessor(stage);

        //Create block sprite
        blockTexture = new Texture(Gdx.files.internal("characters/chain/chain.png"));
        blockSprite = new Sprite(blockTexture);
        //Set position to centre of the screen
        blockSprite.setPosition(Gdx.graphics.getWidth()/2-blockSprite.getWidth()/2, Gdx.graphics.getHeight()/2-blockSprite.getHeight()/2);

        blockSpeed = 5;
    }

    public void draw() {
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();

    }


    public Touchpad getTouchpad() {
        return touchpad;
    }
}
