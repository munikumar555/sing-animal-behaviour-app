package com.singtel.app.model;

import com.singtel.app.behaviour.Flyable;
import com.singtel.app.behaviour.Singable;
import com.singtel.app.behaviour.Swimmable;
import com.singtel.app.behaviour.Walkable;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public abstract class LivingThing {

    protected Walkable walkable;
    protected Flyable flyable;
    protected Singable singable;
    protected Swimmable swimmable;

    public void walk(){
        this.walkable.walk();
    }

    public void fly() {
        this.flyable.fly();
    }

    public void sing() {
        this.singable.sing();
    }

    public void swim() {
        this.swimmable.swim();
    }
}
