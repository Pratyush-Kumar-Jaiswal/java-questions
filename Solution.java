import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rs="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            rs+=c;
        }
        if(rs.compareTo(s)==0)
            System.out.println("Yes");
        else
            System.out.println("No");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
