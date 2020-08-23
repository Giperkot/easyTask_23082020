package task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Task2 {


    private static boolean isCorrectBracketSeq (String inputStr) {
        if (inputStr.isEmpty()) {
            return true;
        }

        Deque<EBracket> brackerStack = new ArrayDeque<>();

        for (int i = 0; i < inputStr.length(); i++) {
            char symbol = inputStr.charAt(i);

            EBracket bracket = EBracket.getBySymbol(symbol);

            if (bracket == null) {
                continue;
            }

            if (bracket.getType() == 0) {
                // открывающаяся.
                brackerStack.push(bracket);
            } else {
                // Закрывающаяся.
                EBracket lastBracket = brackerStack.pop();

                if (bracket.getCode() != lastBracket.getCode()) {
                    return false;
                }

            }
        }

        if (brackerStack.isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

        String bracketsStr = br.readLine();

        String result;

        if (isCorrectBracketSeq(bracketsStr)) {
            result = "True";
        } else {
            result = "False";
        }

        System.out.println(result);
    }

}
