public class ArraySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        ArraySearch obj=new ArraySearch();
        obj.search(arr,10);


    }
    void search(int arr[],int e){
        int flag=0;
        for(var i=0;i<arr.length;i++){
            if(arr[i]==e){
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Element not found");
        else
            System.out.println("Element found");
            


        

    }
}
