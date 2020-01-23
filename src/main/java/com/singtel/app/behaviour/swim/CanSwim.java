package com.singtel.app.behaviour.swim;

import com.singtel.app.behaviour.Swimmable;

/**
 * @author munikumarchallagulla
 *
 */
public class CanSwim implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
