package com.oan.utils.adventofcode;

import com.oan.adventofcode.Day2GiftShop;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day2GiftShopTest {
    Day2GiftShop task = new Day2GiftShop();

    @Test
    public void test1() {
        String[] input = {"11-22", "95-115", "998-1012", "1188511880-1188511890", "222220-222224",
                "1698522-1698528", "446443-446449", "38593856-38593862", "565653-565659",
                "824824821-824824827", "2121212118-2121212124" };
        System.out.println(task.getInvalidInputsSum(input));
    }

    @Test
    public void test2() {
        String fileName = "src/test/resources/test-input/day2input.txt";

        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));
            String[] array = lines.toArray(new String[0]);

            System.out.println(task.getInvalidInputsSum(array[0].split(",")));
        } catch (IOException e) {
            throw new RuntimeException("Check if input is provided in day2input.txt", e);
        }
    }

    @Test
    public void test3() {
        String[] input = {"171-671" };
        System.out.println(task.getInvalidInputsSum(input));
    }
}

