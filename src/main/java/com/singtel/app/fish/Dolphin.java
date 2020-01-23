package com.singtel.app.fish;

import com.singtel.app.behaviour.swim.GreatSwimmers;
import com.singtel.app.model.Fish;
import com.singtel.app.model.LivingThing;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Dolphin extends LivingThing {

    Fish fish;

    public Dolphin(){
        this.swimmable= new GreatSwimmers();
        this.fish =new Fish();
        this.walkable = this.fish.getWalkable();
        this.singable = this.fish.getSingable();
    }

}
