package com.oan.utils.adventofcode;

import com.oan.adventofcode.Day5Cafeteria;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Day5CafeteriaTest {
    Day5Cafeteria task = new Day5Cafeteria();

    @Test
    public void test1() {
        List<String> input = Arrays.asList("3-5",
                "10-14",
                "16-20",
                "12-18",
                "",
                "1",
                "5",
                "8",
                "11",
                "17",
                "32");
        System.out.println(task.getFreshIngredientsAmount(input));
    }

    @Test
    public void test2() {
        String fileName = "src/test/resources/test-input/day5input.txt";

        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));

            System.out.println(task.getFreshIngredientsAmount(lines));
        } catch (IOException e) {
            throw new RuntimeException("Check if input is provided in day5input.txt", e);
        }
    }

}

