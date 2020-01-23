package com.singtel.app;

import com.singtel.app.fish.Shark;
import com.singtel.app.util.Color;
import com.singtel.app.util.Size;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * @author munikumarchallagulla
 *
 */
public class SharkTest extends BaseTest {

    Shark shark;

    @Before
    public void setUp() {
        shark = new Shark();
    }

    @Test
    public void should_Not_Walk_When_Call_Walk() {
        shark.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        shark.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }

    @Test
    public void should_Swim_When_Call_Swim() {
        shark.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }

    @Test
    public void should_Return_Large_When_Call_Size() {
        Size size = shark.size();
        assertEquals(Size.LARGE, size);
    }

    @Test
    public void should_Return_Grey_When_Call_Color() {
        Color color = shark.color();
        assertEquals(Color.GREY, color);
    }

}