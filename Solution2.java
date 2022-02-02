import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int count=0;
        String rs[]=new String[n];
        for(int i=0;i<n;i++){
            if(arr[i].contains("HR")){
                rs[count]=arr[i];
                count++;
            }
        }
        if(count==0)
        {
            System.out.println(-1);
            return;
        }
        System.out.println(count);
        for(int i=0;i<n;i++){
            if(rs[i]!=null)
            System.out.println(rs[i].toUpperCase());
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
