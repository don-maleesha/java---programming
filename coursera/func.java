public class func {
    
    public static void main(String[] args) {
        
        func functions = new func();
        int result = functions.start();
        System.out.println(result);
    }

    public int func2(int w) {
        return w * 3;
    }

    public int func1(int a, int b) {
        int n = a + b;
        return 2 + func2(n);
    }

    public int start() {
        int z = 4;
        return func1(z, 1) - 3;
    }
}
