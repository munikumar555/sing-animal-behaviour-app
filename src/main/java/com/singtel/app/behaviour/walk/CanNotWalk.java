package com.singtel.app.behaviour.walk;

import com.singtel.app.behaviour.Walkable;

/**
 * @author munikumarchallagulla
 *
 */
public class CanNotWalk implements Walkable {

    @Override
    public void walk() {
        System.out.println("Can not walk");
    }
}
