package com.singtel.app.model.animal;

import com.singtel.app.behaviour.fly.CanFly;
import com.singtel.app.behaviour.sing.CanNotSing;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Butterfly extends Caterpillar {

    public Butterfly(){
        this.flyable =new CanFly();
        this.singable= new CanNotSing();
    }
}
