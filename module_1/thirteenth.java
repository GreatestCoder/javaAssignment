package submissions.module_1;

class Primitives {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    void printDefaults() {
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: [" + c + "]");
        System.out.println("boolean: " + bool);
    }
}

public class thirteenth {
    public static void main(String[] args) {
        Primitives p = new Primitives();
        p.printDefaults();
    }
}
