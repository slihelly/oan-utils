package com.oan.utils.adventofcode;

import com.oan.adventofcode.Day6TrashCompactor;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day6TrashCompactorTest {
    Day6TrashCompactor task = new Day6TrashCompactor();

    @Test
    public void test1() {
        String[] input = {"123 328  51 64 ",
                " 45 64  387 23 ",
                "  6 98  215 314",
                "*   +   *   +  "};
        System.out.println(task.getGrandTotal(input));
    }

    @Test
    public void test2() {
        String fileName = "src/test/resources/test-input/day6input.txt";

        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));

            System.out.println(task.getGrandTotal(lines.toArray(new String[0])));
        } catch (IOException e) {
            throw new RuntimeException("Check if input is provided in day6input.txt", e);
        }
    }

}

