import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String a = sc.nextLine();
        // System.out.println(a);
        String example = "Hrishi";
        example = example.toUpperCase();
        String result = translator.translate(example);
        System.out.println("result:" + result);
        String reverse = translator.reverseTranslate(result);
        System.out.println("reverse result:" + reverse);
    }
}
