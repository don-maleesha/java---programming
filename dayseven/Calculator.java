public class Calculator {
    
    int a, b;
    float c, d;

    public Calculator(int a, int b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int add() {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public int divide() {
        return a / b;
    }

    public float divide(float a, float b) {
        return a / b;
    }

}
