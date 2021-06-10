package Easy.Task_2;

import java.util.Arrays;
import java.util.Scanner;

public class test_sort {
    private static String maxWord;
//abc sdasdz sdaxza sczxcasd abc abc zzz <-- for test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String[] m = title.split(" ");
        Arrays.sort(m);
        maxWord = "";
        String word = "";
        int maxCount = 0, count = 1;
        for (String s : m) {
            if (s.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = s;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxWord = word;
        }
        System.out.println(maxWord);
    }
    public String toString(){
        return maxWord;
    }
}
