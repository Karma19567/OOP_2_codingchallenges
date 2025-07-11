
public class SumRecursion {

    public static int sum(int n){
        //Base case
        if(n==1){
            return 1;
        }else {
            //Recursive  case
            return sum(n - 1) + n;
        }
    }



    public static void main(String[] args){
        int result=sum (5);
        System.out.println("Sum: "+result);//output:Sum:15
    }
}

