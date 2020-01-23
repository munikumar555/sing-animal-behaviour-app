package com.singtel.app.util;

import com.singtel.app.behaviour.Flyable;
import com.singtel.app.behaviour.Singable;
import com.singtel.app.behaviour.Swimmable;
import com.singtel.app.behaviour.Walkable;
import com.singtel.app.behaviour.fly.CanFly;
import com.singtel.app.behaviour.sing.CanSing;
import com.singtel.app.behaviour.swim.CanSwim;
import com.singtel.app.behaviour.walk.CanWalk;
import com.singtel.app.model.LivingThing;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author munikumarchallagulla
 *
 */
public class CountAnimals {

    public long walkableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Walkable> livingThingToWalkable = LivingThing::getWalkable;
        return getCount(livingThings, livingThingToWalkable, walkable -> walkable instanceof CanWalk);
    }

    public long flyableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Flyable> livingThingToFlyable = LivingThing::getFlyable;
        return getCount(livingThings, livingThingToFlyable, flyable -> flyable instanceof CanFly);
    }

    public long singableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Singable> livingThingToSingable = LivingThing::getSingable;
        return getCount(livingThings, livingThingToSingable, singable -> singable instanceof CanSing);
    }

    public long swimmableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Swimmable> livingThingToSwimmable = LivingThing::getSwimmable;
        return getCount(livingThings, livingThingToSwimmable, swimmable -> swimmable instanceof CanSwim);
    }

    private long getCount(List<LivingThing> livingThings, Function function, Predicate predicate) {
        return Optional.ofNullable(livingThings).map(Collection::parallelStream).orElseGet(Stream::empty)
                .map(function)
                .filter(predicate)
                .count();
    }

}
