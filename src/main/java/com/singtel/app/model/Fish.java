package com.singtel.app.model;

import com.singtel.app.behaviour.sing.CanNotSing;
import com.singtel.app.behaviour.swim.CanSwim;
import com.singtel.app.behaviour.walk.CanNotWalk;
import com.singtel.app.util.Color;
import com.singtel.app.util.Size;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Fish  extends LivingThing {

    protected Size size;
    protected Color color;

    public Fish(){
        this.swimmable=new CanSwim();
        this.walkable =new CanNotWalk();
        this.singable= new CanNotSing();
    }

    public Size size() {
        return size;
    }

    public Color color() {
        return color;
    }
}
