/**
 * Car
 */
public class Car {
    String manu;
    int price;
    
    public Car(String manu, int price) {
        this.manu = manu;
        this.price = price;
    }


    

    public static void main(String[] args) {
        Car obj1=new Car("Mahindra", 1000000);
        Car obj2=new Car("Tata",400000);
        Car obj3=new Car("Audi", 100000000);
        System.out.println(obj1.manu+"\n"+obj1.price);
        System.out.println(obj2.manu+"\n"+obj2.price);
        System.out.println(obj3.manu+"\n"+obj3.price);
    }

    
 
}
