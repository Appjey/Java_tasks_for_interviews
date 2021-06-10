package Easy.Task_3;

import java.text.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Example: sdaczxca 25-05-1999 xcascza 01-05-2000\nWrite String with date:\n");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yy");
        ParsePosition pos = new ParsePosition(0);
        for (int i = 0; i < s.length(); i++) {
            pos.setIndex(i);
            Date parse = format.parse(s, pos);
            if (Objects.nonNull(parse)) {
                String date = format.format(parse);
                System.out.println(date);
                i += date.length();
            }
        }
    }
}
