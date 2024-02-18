import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class translator {
    public static String translate(String string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            String d = morseEnum.getMorse(c);
            list.add(String.valueOf(d));
        }
        return list.stream().map(Object::toString).collect(Collectors.joining(" "));
    }

    public static String reverseTranslate(String string) {
        String[] arr = string.split(" ");
        String result = "";
        for (String s : arr) {
            result += String.valueOf(morseEnum.getCharFromMorse(s));
        }
        return result;
    }

    public static void main(String[] args) {
        String example = "-*** ***";
        System.out.print(reverseTranslate(example));
    }
}