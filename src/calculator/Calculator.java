
package calculator;
import java.util.Scanner;
 
public class Calculator {

    public static void main(String[] args) {
       float number1,number2,result;
       
        System.out.println("Enter 2 numbers");
        Scanner sc=new Scanner(System.in);
        number1=sc.nextFloat();
        number2=sc.nextFloat();
        System.out.println("1.Addition\n2.Substraction\n3.Multiplecation\n4.Division\n");
        
           System.out.println("Enter choice number");
            int choice;
            choice=sc.nextInt();
             switch(choice)
               
                 {
                   case 1:
                     result=add(number1,number2); 
                      System.out.println("Addition:"+result);
                       break;
             
            
    
        case 2:
                     result=sub(number1,number2); 
                      System.out.println("substraction:"+result);
                       break;
             
    
                
    
        case 3:
                     result=mul(number1,number2); 
                      System.out.println("multiplication:"+result);
                       break;
            
            
        case 4:
                     result=div(number1,number2); 
                      System.out.println("Division:"+result);
                       break;
             }
    }
      public static float add(float a,float b){
      return a+b;
}
     public static float sub(float a,float b){
      return a+b;
    }
      public static float mul(float a,float b){
      return a+b;
      }
       public static float div(float a,float b){
           if(b==0){
             System.out.println("Division cannot be possible");
           
      return 0;
           }
           else{
           return a/b;
           }
       
           
       }
           
}
       
       
