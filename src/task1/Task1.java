package task1;

import java.io.*;

/**
 * В компании подарили каждому сотруднику два талона на обед в близлежащем ресторане.
 * Сотрудники могли взять талоны и записать номер своего бейджика в специальный бланк.
 * Так сделали все кроме одного сотрудника. Нужно вычислить, кто же это такой! На вход подается непустой массив целых чисел.
 * Каждое из них, за исключением одного, встречается 2 раза. Размер массива не превосходит 10000.
 * Числа по модулю не больше 10000. Нужно выяснить, кто не такой, как все!
 */

public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

        br.readLine();

        String[] employeeIdArr = br.readLine().split(" ");

        int result = 0;

        for (String employeeId : employeeIdArr) {
            result ^= Integer.valueOf(employeeId);
        }

        System.out.println(result);
    }
}
