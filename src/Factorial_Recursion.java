public class Factorial_Recursion {

    public static int factorial(int n){
        if (n == 0||n==1) {
            return 1;
        }else{return n*factorial(n-1);
        }

    }
    public static void main(String[] args) {
        System.out.println("factorial 7:"+ factorial(7));
    }
}
