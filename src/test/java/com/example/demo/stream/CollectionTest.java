package com.example.demo.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Geonguk Han
 * @since 2020-08-28
 */
public class CollectionTest {

    @Data
    @AllArgsConstructor
    class Actor {
        String name;
        String role;

    }

    @Test
    void toMapTest() {
        final Actor actor = new Actor("andrew", "handsome man");
        final Actor actor1 = new Actor("betty", "pretty woman");
        Set<Actor> actors = new HashSet<>();
        actors.add(actor);
        actors.add(actor1);

        final Set<Actor> actorSet = Collections.unmodifiableSet(new HashSet<>(actors));


        final Map<String, Actor> collect = actorSet.stream()
                .collect(Collectors.toMap(Actor::getName, Function.identity()));

        System.out.println(collect);


    }
}
