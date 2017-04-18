package com.battmenstudios.schmelda.tools;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.battmenstudios.schmelda.Schmelda;
import com.battmenstudios.schmelda.screens.PlayScreen;

/**
 * Created by benvi on 4/13/2017.
 */

public class B2WorldCreator {

    public B2WorldCreator(PlayScreen screen) {
        World world = screen.getWorld();
        TiledMap map = screen.getMap();

        BodyDef bdef = new BodyDef();
        PolygonShape shape = new PolygonShape();
        FixtureDef fdef = new FixtureDef();
        Body body;

        //Construct World Barriers
        for (MapObject object : map.getLayers().get(5).getObjects().getByType(RectangleMapObject.class)) {
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set((rect.getX() + rect.getWidth() / 2) / Schmelda.PPM, (rect.getY() + rect.getHeight() / 2) / Schmelda.PPM);
//            bdef.position.set((rect.getX() + rect.getWidth() / 2), (rect.getY() + rect.getHeight() / 2));

            body = world.createBody(bdef);

//            shape.setAsBox(rect.getWidth() / 2, rect.getHeight() / 2);
            shape.setAsBox(rect.getWidth() / 2 / Schmelda.PPM, rect.getHeight() / 2 / Schmelda.PPM);
            fdef.shape = shape;
            body.createFixture(fdef);
        }

        //Construct Other boundaries...
    }
}
