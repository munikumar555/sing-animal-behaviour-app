package com.singtel.app.behaviour.sing;

/**
 * @author munikumarchallagulla
 *
 */
public class RoosterSound extends CanSing {

    @Override
    public void sing() {
        System.out.println(getSound("rooster"));
    }
}
