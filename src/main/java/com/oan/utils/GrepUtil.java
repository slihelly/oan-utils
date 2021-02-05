package com.oan.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GrepUtil {

    public static List<String> processDirectory(File dir) {
        List<String> output = new ArrayList<>();
        for (File f: dir.listFiles()) {
            if(f.isDirectory()) {
                output.addAll(processDirectory(f));
            } else {
                List<String> lines = null;
                try {
                    lines = Files.lines(Paths.get(f.getAbsolutePath())).collect(Collectors.toList());
                } catch (IOException e) {
                    System.out.println("File read fail");
                    e.printStackTrace();
                }
                output.addAll(processFileLinesGrepIds(lines));
            }
        }
        return output;
    }

    public static List<String> processFileLinesGrepIds(List<String> lines) {
        List<String> output = new ArrayList<>();
        for(int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if(line.trim().startsWith("@TestCaseId")) {
                String outLine = line.trim();
                for (int j = i + 1; j < lines.size(); j++) {
                    String nextLine = lines.get(j);
                    if(nextLine.contains("public void") || nextLine.contains("public") || nextLine.contains("void")) {
                        outLine = outLine + "\t" + nextLine.trim();
                        break;
                    }
                }
                output.add(outLine);
            }
        }
        return output;
    }
}
