package com.singtel.app.model.bird;

import com.singtel.app.behaviour.sing.DuckSound;
import com.singtel.app.behaviour.swim.CanSwim;
import com.singtel.app.model.Bird;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Duck extends Bird {

    public Duck(){
        this.singable =new DuckSound();
        this.swimmable= new CanSwim();
    }
}
