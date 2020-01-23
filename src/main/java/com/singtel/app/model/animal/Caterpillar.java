package com.singtel.app.model.animal;

import com.singtel.app.behaviour.fly.CanNotFly;
import com.singtel.app.behaviour.walk.CrawlWalk;
import com.singtel.app.model.Animal;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Caterpillar extends Animal {

    public Caterpillar(){
        this.flyable= new CanNotFly();
        this.walkable= new CrawlWalk();
    }
}
