package com.pivovarit.aoc.util;

import java.util.function.Supplier;

public final class Util {

    private Util() {
    }

    public static <T> T timed(Supplier<T> action) {
        long start = System.currentTimeMillis();
        T result = action.get();
        System.out.println("Elapsed time: " + (System.currentTimeMillis() - start) + "ms");
        return result;
    }
}
