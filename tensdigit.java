/**
 * tensdigit
 */

import java.util.*;
public class tensdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        n=n/10;
        int tp=n%10;
        System.out.println(tp);
        sc.close();
    }
}
