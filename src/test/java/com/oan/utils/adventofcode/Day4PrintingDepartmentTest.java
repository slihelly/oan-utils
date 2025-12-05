package com.oan.utils.adventofcode;

import com.oan.adventofcode.Day4PrintingDepartment;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day4PrintingDepartmentTest {
    Day4PrintingDepartment task = new Day4PrintingDepartment();

    @Test
    public void test1() {
        String[] input = {"..@@.@@@@.",
                "@@@.@.@.@@",
                "@@@@@.@.@@",
                "@.@@@@..@.",
                "@@.@@@@.@@",
                ".@@@@@@@.@",
                ".@.@.@.@@@",
                "@.@@@.@@@@",
                ".@@@@@@@@.",
                "@.@.@@@.@." };
        System.out.println(task.getAccessibleRollsAmount(input));
    }

    @Test
    public void test2() {
        String fileName = "src/test/resources/test-input/day4input.txt";

        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));
            String[] array = lines.toArray(new String[0]);

            System.out.println(task.getAccessibleRollsAmount(array));
        } catch (IOException e) {
            throw new RuntimeException("Check if input is provided in day4input.txt", e);
        }
    }
}

