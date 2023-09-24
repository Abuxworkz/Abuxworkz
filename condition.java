class Class1 {
    int value;

    Class1(int val) {
        this.value = val;
    }

    Class1() {
        this.value = 0;
    }

    void display() {
        System.out.println("Class1 Value: " + this.value);
    }

    void methodWithIfElse() {
        if (value > 5) {
            System.out.println("Value is greater than 5.");
        } else {
            System.out.println("Value is less than or equal to 5.");
        }
    }
}

class Class2 {
    String text;

    Class2(String str) {
        this.text = str;
    }

    Class2() {
        this.text = "Default Text";
    }

    void display() {
        System.out.println("Class2 Text: " + this.text);
    }

    void methodWithIfElse() {
        if (text.equals("Hello")) {
            System.out.println("Text is 'Hello'.");
        } else {
            System.out.println("Text is not 'Hello'.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Class1 obj1 = new Class1(7);
        obj1.display();
        obj1.methodWithIfElse();

        Class1 obj2 = new Class1();
        obj2.display();
        obj2.methodWithIfElse();

        Class2 obj3 = new Class2("Hello");
        obj3.display();
        obj3.methodWithIfElse();

        Class2 obj4 = new Class2();
        obj4.display();
        obj4.methodWithIfElse();
    }
}
