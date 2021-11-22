import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Index Element you want to access");
        int i=sc.nextInt();
        try{
            System.out.println("Element at Index "+i+"="+arr[i]);
            System.out.println("The array element successfully accessed");
        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    
}
