package com.singtel.app.model.animal;

import com.singtel.app.behaviour.sing.CatSound;
import com.singtel.app.model.Animal;

import lombok.Data;

/**
 * @author munikumarchallagulla
 *
 */
@Data
public class Cat extends Animal {

    public Cat(){
        this.singable= new CatSound();
    }
}
