package com.singtel.app;


import org.junit.rules.ExternalResource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author munikumarchallagulla
 *
 */
public class SystemOutRes extends ExternalResource {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Override
    protected void before() {
        System.setOut(new PrintStream(outContent));
    }

    @Override
    protected void after() {
        System.setOut(System.out);
    }

    public String asString() {
        return outContent.toString();
    }
}
