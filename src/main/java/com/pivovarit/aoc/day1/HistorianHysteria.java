package com.pivovarit.aoc.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static com.pivovarit.aoc.util.Util.timed;

class HistorianHysteria {

    public static void main(String[] args) {
        var result = timed(() -> {
            var firstList = new ArrayList<Integer>();
            var secondList = new ArrayList<Integer>();

            try (var lines = Files.lines(Path.of("src/main/resources/day1/input"))) {
                lines
                  .map(str -> str.split(" {3}"))
                  .forEach(pair -> {
                      firstList.add(Integer.parseInt(pair[0]));
                      secondList.add(Integer.parseInt(pair[1]));
                  });
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return solvePart1(firstList, secondList);
        });

        System.out.println("result = " + result);
    }

    static long solvePart1(List<Integer> firstList, List<Integer> secondList) {
        var first = new ArrayList<>(firstList);
        var second = new ArrayList<>(secondList);
        Collections.sort(first);
        Collections.sort(second);

        return IntStream.range(0, first.size())
          .map(i -> Math.abs(first.get(i) - second.get(i)))
          .sum();
    }

    static long solvePart2(List<Integer> firstList, List<Integer> secondList) {
        return 0;
    }
}
