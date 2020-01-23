package com.singtel.app;

import org.junit.Before;
import org.junit.Test;

import com.singtel.app.model.animal.Caterpillar;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author munikumarchallagulla
 *
 */
public class CaterpillarTest extends BaseTest {

	Caterpillar caterpillar;

	@Before
	public void setUp() {
		this.caterpillar = new Caterpillar();
	}

	@Test
	public void should_Crawl_When_Call_Walk() {
		caterpillar.walk();
		assertThat(sysOut.asString(), containsString("I am crawling"));
	}

	@Test
	public void should_Not_Fly_When_Call_Fly() {
		caterpillar.fly();
		assertThat(sysOut.asString(), containsString("Can not fly"));
	}
}
