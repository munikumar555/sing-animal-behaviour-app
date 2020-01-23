package com.singtel.app;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.singtel.app.behaviour.sing.CatSound;
import com.singtel.app.behaviour.sing.DogSound;
import com.singtel.app.behaviour.sing.DuckSound;
import com.singtel.app.behaviour.sing.RoosterSound;
import com.singtel.app.model.bird.Parrot;

/**
 * @author munikumarchallagulla
 *
 */
public class ParrotTest extends BaseTest {

    Parrot parrot;

    @Before
    public void setUp(){
        parrot= new Parrot();
    }

    @Test
    public void should_Say_Woof_Woof_When_ParrotLivingWithDog(){
        parrot.setSingable(new DogSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Woof,woof"));
    }

    @Test
    public void should_Say_Meow_When_ParrotLivingWithCat(){
        parrot.setSingable(new CatSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Meow"));
    }

    @Test
    public void should_Say_Cock_a_doodle_doo_When_ParrotLivingWithRooster(){
        parrot.setSingable(new RoosterSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }

    @Test
    public void should_Say_Quack_Quack_When_ParrotLivingWithDuck(){
        parrot.setSingable(new DuckSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Quack, quack"));
    }

}
