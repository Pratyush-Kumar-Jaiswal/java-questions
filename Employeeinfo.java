
public class Employeeinfo {
    public static void main(String[] args) {
        System.out.println("Name"+"        "+"Year"+"       "+"Addres");
        Employee e1=new Employee("Aman", 2021, "Chandigarh");
        e1.display();
        Employee e2=new Employee("Sunil", 2000, "Mathura");
        e2.display();
        Employee e3=new Employee("Rohan", 2010, "Agra");
        e3.display();
    }
}
class Employee{
    String ename;
    int yoj;
    String addrs;
    public Employee(String ename, int yoj, String addrs){
        this.ename=ename;
        this.yoj=yoj;
        this.addrs=addrs;
    }
    public void display(){
        System.out.println(ename+"        "+yoj+"       "+addrs);
    }
}
