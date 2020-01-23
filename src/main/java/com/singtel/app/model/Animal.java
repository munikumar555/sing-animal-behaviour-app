package com.singtel.app.model;

import com.singtel.app.behaviour.walk.CanWalk;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Animal extends LivingThing {

    public Animal() {
        this.walkable = new CanWalk();
    }
}
