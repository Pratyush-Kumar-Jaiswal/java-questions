import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GraphDS {
    HashMap <String,Integer> obj;

    public GraphDS() {
        obj=new HashMap<>();
    }
    void insert(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the key");
        String key=sc.next();
        System.out.println("Enter the value");
        int value=sc.nextInt();
        obj.put(key,value);
    }
    void print(){
        for (Map.Entry<String,Integer> entry: obj.entrySet()) {
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
    public static void main(String[] args) {

          GraphDS g=new GraphDS();
          g.insert();
          g.insert();
          g.insert();
          g.print();
//        obj.put("ABC",10);
//        obj.put("DEF",20);
//        obj.put("IJK",30);
//        obj.put("LMN",40);
//        obj.put("OPQ",50);
//        obj.put("RST",60);         //keys can't be duplicate but values can be
        
//        System.out.println(obj.getOrDefault("ABC",0));
//        System.out.println(obj.getOrDefault("DEF",0));
//        System.out.println(obj.getOrDefault("IJK",0));
//        System.out.println(obj.getOrDefault("JHJ",0));


    }
}
