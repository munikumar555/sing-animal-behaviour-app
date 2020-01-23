package com.singtel.app.model.bird;

import com.singtel.app.behaviour.sing.RoosterSound;
import com.singtel.app.model.Bird;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Rooster extends Bird {

    Chicken chicken;

    public Rooster(){
        this.singable= new RoosterSound();
        this.chicken=new Chicken();
    }

    @Override
    public void fly(){
        this.chicken.fly();
    }
}
