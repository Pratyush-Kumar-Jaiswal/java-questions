import java.util.*;
public class calculator {
    static int powerInt(int num1,int num2){
        Double a=(double) (num1);
        Double b=(double) (num2);
        int pow=(int) (Math.pow(a, b));
        return pow;
    }
    static Double powerDouble(Double num1,Double num2){
        return Math.pow(num1,num2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st no");
        Double a=sc.nextDouble();
        System.out.println("Enter the 2nd no");
        Double b=sc.nextDouble();
        var x=powerDouble(a, b);
        System.out.println(x);
        sc.close();
    }
}
