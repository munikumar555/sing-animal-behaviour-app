package com.singtel.app.behaviour;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * @author munikumarchallagulla
 *
 */
@FunctionalInterface
public interface Singable {

    void sing();

    default ResourceBundle getBundle() {
        Locale locale = Optional.ofNullable(Locale.getDefault()).orElse(Locale.ENGLISH);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("application", locale);
        return resourceBundle;
    }

    default String getSound(String livingthing) {
        StringBuffer sound = new StringBuffer(livingthing).append(".sound");
        return getBundle().getString(sound.toString());
    }
}
