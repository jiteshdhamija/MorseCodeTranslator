public class translator {
    public static String translate(String string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            System.out.println(morseEnum.getMorse(c));
        }
        return null;
    }
}