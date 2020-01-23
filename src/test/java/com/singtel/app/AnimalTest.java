package com.singtel.app;

import org.junit.Test;

import com.singtel.app.model.Animal;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author munikumarchallagulla
 *
 */
public class AnimalTest extends BaseTest {

    @Test
    public void testWalk() {
        Animal animal = new Animal();
        animal.walk();
        assertThat(sysOut.asString(), containsString("I am walking"));
    }
}
