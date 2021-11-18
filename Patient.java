import java.util.*;
public class Patient {
    static String patientname;
    static double height;
    static double weight;
    double computeBMI()
    {
        double bmi=weight/(height*height);
        return bmi;
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the patient name");
        patientname=sc.nextLine();
        System.out.println("Enter the height ");
        height= sc.nextDouble();
        System.out.println("Enter the weight");
        weight=sc.nextDouble();
        Patient obj= new Patient();
        double bmi=obj.computeBMI();
        System.out.println("BMI is "+bmi);
        sc.close();
    }
}
