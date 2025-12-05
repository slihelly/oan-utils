package com.oan.utils.adventofcode;

import com.oan.adventofcode.Day3Lobby;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day3LobbyTest {
    Day3Lobby task = new Day3Lobby();

    @Test
    public void test1() {
        String[] input = {"987654321111111", "811111111111119", "234234234234278", "818181911112111"};
        System.out.println(task.getTotalOutputJoltage(input));
    }

    @Test
    public void test2() {
        String fileName = "src/test/resources/test-input/day3input.txt";

        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));
            String[] array = lines.toArray(new String[0]);

            System.out.println(task.getTotalOutputJoltage(array));
        } catch (IOException e) {
            throw new RuntimeException("Check if input is provided in day3input.txt", e);
        }
    }

    @Test
    public void test3() {
        String[] input = {"234234234234278"};
        System.out.println(task.getTotalOutputJoltage(input));
    }
}

