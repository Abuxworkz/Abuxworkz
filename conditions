class MyClass1 {
    int value;

    MyClass1(int val) {
        this.value = val;
    }

    MyClass1() {
        this.value = 0;
    }

    void display() {
        System.out.println("Value: " + this.value);
    }

    void methodWithIfElse() {
        if (value > 5) {
            System.out.println("Value is greater than 5.");
        } else {
            System.out.println("Value is less than or equal to 5.");
        }
    }
}

class MyClass2 {
    String text;

    MyClass2(String str) {
        this.text = str;
    }

    MyClass2() {
        this.text = "Default Text";
    }

    void display() {
        System.out.println("Text: " + this.text);
    }

    void methodWithIfElse() {
        if ("Hello".equals(text)) {
            System.out.println("Text is 'Hello'.");
        } else {
            System.out.println("Text is not 'Hello'.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass1 obj1 = new MyClass1(7);
        obj1.display();
        obj1.methodWithIfElse();

        MyClass1 obj2 = new MyClass1();
        obj2.display();
        obj2.methodWithIfElse();

        MyClass2 obj3 = new MyClass2("Hello");
        obj3.display();
        obj3.methodWithIfElse();

        MyClass2 obj4 = new MyClass2();
        obj4.display();
        obj4.methodWithIfElse();
    }
}
