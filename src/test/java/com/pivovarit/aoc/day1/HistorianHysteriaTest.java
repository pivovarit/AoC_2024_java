package com.pivovarit.aoc.day1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.pivovarit.aoc.day1.HistorianHysteria.solvePart1;
import static org.assertj.core.api.Assertions.assertThat;

class HistorianHysteriaTest {

    @Test
    void shouldSolvePart1() {
        long result = solvePart1(List.of(3, 4, 2, 1, 3, 3), List.of(4, 3, 5, 3, 9, 3));

        assertThat(result).isEqualTo(11);
    }
}
