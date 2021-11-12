import java.util.*;
class Employee2{
    int salary;
    int noh;
    void getInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        salary=sc.nextInt();
        System.out.println("Enter the number of hours");
        noh=sc.nextInt();
        sc.close();
    }
    void AddSal(){
        if(salary<500)
            salary+=10;
    }
    void AddWok(){
        if(noh>6)
            salary+=5;
    }
    public static void main(String[] args) {
        Employee2 obj=new Employee2();
        obj.getInfo();
        obj.AddSal();
        obj.AddWok();
        System.out.println(obj.salary+"\t"+obj.noh);

    }
}


