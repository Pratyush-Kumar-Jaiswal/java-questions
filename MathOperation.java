public class MathOperation {
    public static void main(String[] args) {
        int sum=0,avg=0;
        int arr[]=new int[4];
        try{
            for(int i=0;i<5;i++){
                arr[i]=(int)(args[i]);
            }
            for(int i=0;i<5;i++){
                sum+=arr[i];
            }
            System.out.println(sum);
            System.out.println(sum/5);
        }  
        catch(ArithmeticException | NumberFormatException e){
            System.out.println(e);
        }
        
         
    }  
}
