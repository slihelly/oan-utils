package com.oan.adventofcode;

public class Day1SecretEntrance {
    public int getPassword(String[] rotations) {
        int current = 50;
        int zeroesCount = 0;

        for (String rotation : rotations) {
            String direction = rotation.trim().substring(0, 1);
            int distance = Integer.parseInt(rotation.trim().substring(1));
            current = applyRotation(current, direction, distance);
            if (current == 0) {
                zeroesCount++;
            }
        }

        return zeroesCount;
    }

    private int applyRotation(int current, String direction, int distance) {
        int distanceFromZero = switch (direction) {
            case "L" -> current - distance;
            case "R" -> current + distance;
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        };
        while (distanceFromZero < 0) {
            distanceFromZero += 100;
        }

        while (distanceFromZero > 99) {
            distanceFromZero -= 100;
        }
        return distanceFromZero;
    }
}
