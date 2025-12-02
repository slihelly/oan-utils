package com.oan.utils.adventofcode;

import com.oan.adventofcode.Day1SecretEntrance;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day1SecretEntranceTest {
    Day1SecretEntrance task = new Day1SecretEntrance();

    @Test
    public void test1() {
        String[] input = {"L68", "L30", "R48", "L5", "R60", "L55", "L1", "L99", "R14", "L82"};
        System.out.println(task.getPassword(input));
    }

    @Test
    public void test2() {
        String fileName = "src/test/resources/test-input/day1input.txt";

        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));
            String[] array = lines.toArray(new String[0]);

            System.out.println(task.getPassword(array));
        } catch (IOException e) {
            throw new RuntimeException("Check if input is provided in day1input.txt", e);
        }
    }
}

