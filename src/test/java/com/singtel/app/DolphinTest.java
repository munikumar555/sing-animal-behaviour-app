package com.singtel.app;

import org.junit.Before;
import org.junit.Test;

import com.singtel.app.model.fish.Dolphin;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author munikumarchallagulla
 *
 */
public class DolphinTest extends BaseTest {

    Dolphin dolphin;

    @Before
    public void setUp() {
        this.dolphin = new Dolphin();
    }

    @Test
    public void should_Not_Walk_When_Call_Walk() {
        dolphin.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        dolphin.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }

    @Test
    public void should_Return_Great_swimmers_When_Call_Swim() {
        dolphin.swim();
        assertThat(sysOut.asString(), containsString("Great swimmers"));
    }
}


