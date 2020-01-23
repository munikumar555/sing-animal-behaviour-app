package com.singtel.app.behaviour.fly;

import com.singtel.app.behaviour.Flyable;

/**
 * @author munikumarchallagulla
 *
 */
public class CanNotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
