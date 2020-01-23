package com.singtel.app.model.bird;

import com.singtel.app.behaviour.fly.CanNotFly;
import com.singtel.app.behaviour.sing.ChickenSound;
import com.singtel.app.model.Bird;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Chicken extends Bird {

    public  Chicken(){
        this.singable=new ChickenSound();
        this.flyable =new CanNotFly();
    }
}
