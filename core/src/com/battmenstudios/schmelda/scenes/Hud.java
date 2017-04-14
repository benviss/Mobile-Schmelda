package com.battmenstudios.schmelda.scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.battmenstudios.schmelda.Schmelda;

/**
 * Created by benvi on 4/14/2017.
 */

public class Hud implements Disposable {
    //Scene2D.ui and its own Viewport
    public Stage stage;
    private Viewport viewport;

    //Labels for HUD
    private Label fpsLabel;

    public Hud(SpriteBatch sb) {
        //setup the HUD viewport using a new camera speperate from gamecam
        viewport = new FitViewport(Schmelda.WIDTH, Schmelda.HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, sb);

        //define a table to organize display
        Table table = new Table();
        table.top();
        table.setFillParent(true);

        fpsLabel = new Label(String.format("%03d", Gdx.graphics.getFramesPerSecond()), new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        table.add(fpsLabel).expandX();

        stage.addActor(table);
    }

    public void update(float dt) {
        fpsLabel.setText(String.format("%03d", Gdx.graphics.getFramesPerSecond()));
    }
    @Override
    public void dispose() {

    }
}
