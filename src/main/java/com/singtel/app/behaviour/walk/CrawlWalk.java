package com.singtel.app.behaviour.walk;

import com.singtel.app.behaviour.Walkable;

/**
 * @author munikumarchallagulla
 *
 */
public class CrawlWalk implements Walkable {
    @Override
    public void walk() {
        System.out.println("I am crawling");
    }
}
