public class Quine {
    public static void main(String[] args) {
        String code = "public class Quine {\n    public static void main(String[] args) {\n        String code = \"%s\";\n        System.out.printf(code, code);\n    }\n}";
        System.out.printf(code, code);
    }
}