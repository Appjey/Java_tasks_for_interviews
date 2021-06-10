package Easy.Task_4;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        //asdnaskd123alsdka655 <-- for test
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int sum = 0;
        for (char c : a.replaceAll("\\D", "").toCharArray()) {
            int digit = c - '0';
            sum += digit;
        }
        System.out.println(sum);
    }
}
