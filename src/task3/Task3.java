package task3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

        int rows = Integer.valueOf(br.readLine());
        int cols = Integer.valueOf(br.readLine());

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] matLine = br.readLine().split(" ");

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.valueOf(matLine[j]);
            }
        }

        int targetRow = Integer.valueOf(br.readLine());
        int targetCol = Integer.valueOf(br.readLine());

        List<Integer> list = new ArrayList<>();

        if (targetRow > 0) {
            list.add(matrix[targetRow - 1][targetCol]);
        }

        if (targetRow < rows - 1) {
            list.add(matrix[targetRow + 1][targetCol]);
        }

        if (targetCol > 0) {
            list.add(matrix[targetRow][targetCol - 1]);
        }

        if (targetCol < cols - 1) {
            list.add(matrix[targetRow][targetCol + 1]);
        }

        System.out.println(list.stream().sorted((a, b) -> a - b).map(a -> String.valueOf(a)).collect(Collectors.joining(" ")));
    }

}
