package gr.aueb.cf.ch3;

public class MulCalculator {

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 2;
        int result = 0;

        result = mul(num1,num2);

        System.out.println("mul:" + result);

    }

    public static int mul(int a, int b){
        return a * b;
    }
}
