public class AreaRect {
    public static void main(String[] args) {
        Rectangle a1=new Rectangle(4,5);
        System.out.println(a1.Area());
        Rectangle a2=new Rectangle(5, 8);
        System.out.println(a2.Area());
    }
}
class Rectangle{
    private int len,br;
    public Rectangle(int l,int b){
        len=l;
        br=b;
    } 
    public int Area(){
        return len*br;
    }
}
