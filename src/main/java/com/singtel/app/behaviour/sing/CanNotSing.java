package com.singtel.app.behaviour.sing;

import com.singtel.app.behaviour.Singable;

/**
 * @author munikumarchallagulla
 *
 */
public class CanNotSing implements Singable {

    @Override
    public void sing() {
        System.out.println("Can not sing");
    }
}
