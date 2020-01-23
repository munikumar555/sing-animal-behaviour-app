package com.singtel.app;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.singtel.app.model.Bird;
import com.singtel.app.model.Fish;
import com.singtel.app.model.LivingThing;
import com.singtel.app.model.animal.Butterfly;
import com.singtel.app.model.animal.Cat;
import com.singtel.app.model.animal.Dog;
import com.singtel.app.model.animal.Frog;
import com.singtel.app.model.bird.Chicken;
import com.singtel.app.model.bird.Duck;
import com.singtel.app.model.bird.Parrot;
import com.singtel.app.model.bird.Rooster;
import com.singtel.app.model.fish.Clownfish;
import com.singtel.app.model.fish.Dolphin;
import com.singtel.app.model.fish.Shark;
import com.singtel.app.util.CountAnimals;

/**
 * @author munikumarchallagulla
 *
 */
public class CountingTest extends BaseTest {

    CountAnimals countAnimals;
    List<LivingThing> livingThings;

    @Before
    public void setUp() {
        this.countAnimals = new CountAnimals();
        livingThings = Arrays.asList(
                new Bird(),  //  Sing, Fly ,Walk
                new Duck(),  //  Sing, Fly ,Walk, Swim
                new Chicken(), // Sing, Fly ,Walk
                new Rooster(), // Sing, Fly ,Walk
                new Parrot(), //Sing, Fly ,Walk
                new Fish(), // Swim
                new Shark(), // Swim
                new Clownfish(), // Swim
                new Dolphin(), // Swim
                new Frog(), // Sing, Walk
                new Dog(), // Sing, Walk
                new Butterfly(), // Fly, Walk
                new Cat());  // Sing, Walk
    }

    @Test
    public void should_Verify_WalkableCount() {
        long count = this.countAnimals.walkableCount(livingThings);
        assertEquals(8, count);
    }

    @Test
    public void should_Verify_FlyableCount() {
        long count = this.countAnimals.flyableCount(livingThings);
        assertEquals(5, count);
    }

    @Test
    public void should_Verify_SingableCount() {
        long count = this.countAnimals.singableCount(livingThings);
        assertEquals(8, count);
    }

    @Test
    public void should_Verify_SwimmableCount() {
        long count = this.countAnimals.swimmableCount(livingThings);
        assertEquals(5, count);
    }
}
