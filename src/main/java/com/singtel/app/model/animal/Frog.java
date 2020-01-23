package com.singtel.app.model.animal;

import com.singtel.app.behaviour.sing.CanSing;
import com.singtel.app.model.Animal;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Frog extends Animal {

    public Frog(){
        this.singable =new CanSing();
    }

}
