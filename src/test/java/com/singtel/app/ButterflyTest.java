package com.singtel.app;

import org.junit.Before;
import org.junit.Test;

import com.singtel.app.model.animal.Butterfly;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author munikumarchallagulla
 *
 */
public class ButterflyTest extends BaseTest {

    Butterfly butterfly;
    @Before
    public void setUp(){
        this.butterfly=new Butterfly();
    }

    @Test
    public void should_Fly_When_Call_Fly() {
        butterfly.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        butterfly.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }
}
