package com.singtel.app;

import org.junit.Before;
import org.junit.Test;

import com.singtel.app.model.bird.Rooster;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author munikumarchallagulla
 *
 */
public class RoosterTest extends BaseTest {

    Rooster rooster;

    @Before
    public void setUp() {
        this.rooster = new Rooster();
    }

    @Test
    public void can_Not_Fly_When_Call_Fly() {
        rooster.fly();
        assertThat(sysOut.asString(), containsString("Can not fly"));
    }

    @Test
    public void should_Say_cock_a_doodle_ooo_When_Sing() {
        rooster.sing();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }
}
