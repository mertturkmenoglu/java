package oop.dsa_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class Node {
    String word;
    int level;
    Node parent;
}

class Path {
    int[] path;
    int n;
    int step;

    Path(int n) {
        this.n = n;
        path = new int[n];
    }
}

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int lineCount = 2415;
        int[][] matrix = new int[lineCount][lineCount];
        Node[] wordList = new Node[lineCount];

        createAdjacencyMatrix(matrix, wordList, lineCount);
        bfsHandler(matrix, wordList, lineCount);
    }

    private static Path bfs(int[][] matrix, Node[] wordList, int wordCount, int startingPoint, int endingPoint) {
        for (int i = 0; i < wordCount; i++) {
            wordList[i].level = 0;
            wordList[i].parent = null;
        }

        LinkedList q = new LinkedList<Node>();
        q.addFirst(wordList[startingPoint]);

        int[] visited = new int[wordCount];
        visited[startingPoint] = 1;

        while (!q.isEmpty()) {
            Node v = (Node) q.removeLast();

            if (wordList[endingPoint].word.equals(v.word)) {
                Path path = new Path(v.level + 1);
                path.step = v.level;
                int j = v.level;

                while(v != null) {
                    path.path[j--] = getIndex(wordList, v.word, wordCount);
                    v = v.parent;
                }

                return path;
            }

            int index = getIndex(wordList, v.word, wordCount);

            for (int i = 0; i < wordCount; i++) {
                if (matrix[index][i] == 1 && visited[i] != 1) {
                    visited[i] = 1;
                    wordList[i].level = v.level + 1;
                    wordList[i].parent = v;
                    q.addFirst(wordList[i]);
                }
            }
        }

        return null;
    }

    private static void bfsHandler(int[][] matrix, Node[] wordList, int wordCount) {
        int i;
        String first, second;
        Path result;

        System.out.println("\nEnter your first word: ");
        first = scanner.nextLine();

        System.out.println("Enter your second word: ");
        second = scanner.nextLine();

        result = bfs(matrix, wordList, wordCount, getIndex(wordList, first, wordCount), getIndex(wordList, second, wordCount));

        if (result != null) {
            System.out.printf("There is a transformation between %s and %s: %d steps\n", first, second, result.step);
            for(i = 0; i < result.n; i++) {
                System.out.printf("%s\n", wordList[result.path[i]].word);
            }
        } else {
            System.out.printf("There is no transformation between %s and %s\n", first, second);
        }
    }

    private static void createAdjacencyMatrix(int[][] matrix, Node[] wordList, int lineCount) {
        int i = 0;
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(
                    "/home/mert/codes/dsa-project/kelime.txt"));
            String line = reader.readLine();
            while (line != null) {
                Node structNode = new Node();
                structNode.word = line;
                structNode.level = 0;
                structNode.parent = null;
                wordList[i++] = structNode;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (i = 0; i < lineCount; i++) {
            for (int j = 0; j < lineCount; j++) {
                matrix[i][j] = (i == j) ? 0 : connection(wordList[i].word, wordList[j].word);
                matrix[j][i] = matrix[i][j];
            }
        }
    }

    private static int getIndex(Node[] wordList, String str, int wordCount) {
        int i = 0;

        while (i < wordCount) {
            int j = 0;
            while (j < 5 && wordList[i].word.charAt(j) == str.charAt(j))
                j++;
            if ( j == 5)
                return i;

            i++;
        }

        return -1;
    }

    private static int connection(String first, String second) {
        int len = 5;
        int i = 0;
        int counter = 0;

        while ((i < len) && (counter < 2)) {
            if (first.charAt(i) != second.charAt(i)) {
                counter++;
            }
            i++;
        }

        return (counter >= 2) ? 0 : 1;
    }
}