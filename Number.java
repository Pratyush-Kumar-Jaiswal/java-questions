import java.util.*;
public class Number {
    int n;

    public Number(int n) {
        this.n = n;
    }
    boolean isZero(){
        if(n==0)
            return true;
        else
            return false;

    }
    boolean isPositive(){
        if(n>0)
            return true;
        else
            return false;

    }
    boolean isNegetive(){
        if(n<0)
            return true;
        else
            return false;

    }
    boolean isOdd()
    {
        if(n%2!=0)
            return true;
        else
            return false;
        
    }
    boolean isEven()
    {
        if(n%2==0)
            return true;
        else
            return false;
        
    }
    boolean isPrime()
    {
        int c=0;
        for(var i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        if(c==0)
            return true;
        else
            return false;
    }
    boolean isArmstrong()
    {
        int nn=0,d=0;
        int t=n;
        int rn=0;
        while(t>0){
            nn++;
            t/=10;

        }
        t=n;
        while(t>0){
            d=t%10;
            rn+=Math.pow(d, nn);
            t/=10;
        }
        if(rn==n)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        Number obj=new Number(n);
        System.out.println("Number is Zero:"+obj.isZero());
        System.out.println("Number is Even:"+obj.isEven());
        System.out.println("Number is Odd:"+obj.isOdd());
        System.out.println("Number is Positive:"+obj.isPositive());
        System.out.println("Number is Negetive:"+obj.isNegetive());
        System.out.println("Number is Prime:"+obj.isPrime());
        System.out.println("Number is ArmStrong:"+obj.isArmstrong());
        sc.close();
    }
}
