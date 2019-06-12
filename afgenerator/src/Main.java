import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(@NotNull String[] args) {
        if (args.length > 2 || args.length <= 0) {
            throw new RuntimeException("Invalid number of arguments");
        }

        String directoryNumber = args[0];
        String title = args[1];

        String path = "/home/mert/codes/cpp/";
        String directoryName = "E" + directoryNumber + "_" + title;
        boolean response = new File(path + directoryName).mkdirs();

        if (response) {
            System.out.println("Directory created");
        }

        PrintWriter writer = null;
        String content = "/**\n" + " * " + title + " example\n" +
                " * g++ main.cpp -Wall -Wextra -Wnon-virtual-dtor -pedantic -g -o main\n" +
                " * valgrind --leak-check=yes -v ./main\n */\n#include <iostream>\n\nint main() {\n" +
                "\n\treturn 0;\n}";
        try {
            writer = new PrintWriter(path + directoryName + "/main.cpp", "UTF-8");
            writer.print(content);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
