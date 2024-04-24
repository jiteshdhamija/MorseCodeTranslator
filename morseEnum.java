public enum morseEnum {
    A('A', "*-"),
    B('B', "-***"),
    C('C', "-*-*"),
    D('D', "-**"),
    E('E', "*"),
    F('F', "**-*"),
    G('G', "--*"),
    H('H', "****"),
    I('I', "**"),
    J('J', "*---"),
    K('K', "-*-"),
    L('L', "*-**"),
    M('M', "--"),
    N('N', "-*"),
    O('O', "---"),
    P('P', "*--*"),
    Q('Q', "--*-"),
    R('R', "*-*"),
    S('S', "***"),
    T('T', "-"),
    U('U', "**-"),
    V('V', "***-"),
    W('W', "*--"),
    X('X', "-**-"),
    Y('Y', "-*--"),
    Z('Z', "--**"),
    One('1', "*----"),
    Two('2', "**---"),
    Three('3', "***--"),
    Four('4', "****-"),
    Five('5', "*****"),
    Six('6', "-****"),
    Seven('7', "--***"),
    Eight('8', "---**"),
    Nine('9', "----*"),
    Zero('0', "-----"),
    Period('.', "*-*-*-"),
    Comma(',', "--**--"),
    Colon(':', "---***"),
    QuestionMark('?', "**--**"),
    Apostrophe('\'', "*----*"),
    Hyphen('-', "-****-"),
    Slash('/', "-**-*"),
    ParenthesesOpen('(', "-*--*-"),
    ParenthesesCLose(')', "-*--*-"),
    Qutations('"', "*-**-*");

    private final char key;
    private String value;

    morseEnum(char a, String b) {
        this.key = a;
        this.value = b;
    }

    static String getMorse(char key) {
        morseEnum[] array = morseEnum.values();
        for (int i = 0; i < array.length; i++) {
            if (key == array[i].key)
                return array[i].value;
        }
        return "";
    }

    static char getCharFromMorse(String morse) {
        morseEnum[] susu = morseEnum.values();
        for (int i = 0; i < susu.length; i++) {
            if (susu[i].value.equals(morse))
                return susu[i].key;
        }
        return ' ';
    }

    public static void main(String[] args) {
        // morseEnum[] susu = morseEnum.values();
        // for (int i = 0; i < susu.length; i++) {
        // System.out.println(susu[i].key + "\t" + susu[i].value);
        // }
        // System.out.println(getMorse('c'));
        // System.out.println(getMorse('C'));
        String string = "ISDIALSJDKJASKLDJLKASJ";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            System.out.println(morseEnum.getMorse(c));
        }
        ;

    }
}
