package com.singtel.app.model;

import com.singtel.app.behaviour.fly.CanFly;
import com.singtel.app.behaviour.sing.CanSing;
import com.singtel.app.behaviour.walk.CanWalk;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Bird extends LivingThing {

    public Bird(){
        this.walkable=new CanWalk();
        this.flyable =new CanFly();
        this.singable=new CanSing();
    }
}