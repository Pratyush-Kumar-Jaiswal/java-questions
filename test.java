import java.io.*;
class test 
{
    public static void main(String[]args)
    {
       try{
           PrintWriter writer=new PrintWriter(System.out);
           writer.write(97);
           writer.close();
       }
       catch(Exception e){
        System.out.println(e);
       }
    }
   
}
