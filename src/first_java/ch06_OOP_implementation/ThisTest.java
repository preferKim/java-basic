package first_java.ch06_OOP_implementation;

public class ThisTest {
    int i = 1;

    public void first() {
        int i = 2;
        int j = 3;
        this.i = i + j;

        second(4);
    }

    public void second(int i) {
        int j = 5;
        this.i = i + j;
    }

    public static void main(String[] args) {
        ThisTest exam = new ThisTest();
        exam.first();
    }
}