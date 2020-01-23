package com.singtel.app.model.animal;

import com.singtel.app.behaviour.sing.DogSound;
import com.singtel.app.model.Animal;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Dog extends Animal {

    public Dog(){
        this.singable = new DogSound();
    }
}
