import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any string!!!");
        String input = sc.next();
        System.out.println("input is : " + input);
        String output = removeDuplicates(input);
        System.out.println("output is : " + output);
    }

    private static String removeDuplicates(String input) {
        StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if(output.indexOf(String.valueOf(ch)) < 0)
                output.append(ch);
        }
         return output.toString();
    }
}

