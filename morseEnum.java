public enum morseEnum {

    A("a", "._._"),
    B("b", "_._");

    private final String key;
    private String value;

    morseEnum(String a, String b) {
        this.key = a;
        this.value = b;
    }
}
