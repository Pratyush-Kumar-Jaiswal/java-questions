import java.util.*;
public class Room {
    boolean AC_ON;
    boolean HOMETHEATERE_ON;
    boolean FAN_ON;
    boolean LIGHT_ON;
    public static void main(String[] args) {
        int watt=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Is ac on (Y for yes)");
        char ch=sc.next().charAt(0);
        if (ch=='y'||ch=='Y')
            watt+=1200;
        System.out.println("Is home theatere on(Y for yes)");
        ch=sc.next().charAt(0);
        if(ch=='y'||ch=='Y')
            watt+=600;
        System.out.println("Is fan on(Y for yes)");
        ch=sc.next().charAt(0);
        if(ch=='y'||ch=='Y')
            watt+=400;
        System.out.println("Is fan on(Y for yes)");
        ch=sc.next().charAt(0);
        if(ch=='y'||ch=='Y')
            watt+=100;
        

        if(watt==2000)
            System.out.println("Overload");
        else
            System.out.println("Normal");
            

        sc.close();
    }    
    
}
