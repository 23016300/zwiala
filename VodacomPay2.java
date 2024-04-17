import java.util.Scanner;
public class VodacomPay2{
    public static void main(String args []){
        Scanner zwiala=new Scanner(System.in);
        
        System.out.println("0"+"shake every day");
        System.out.println("1"+"vodapay");
        System.out.println("2"+"balance");
        System.out.println("3"+"buy");
        
        int option=zwiala.nextInt();
        
        if(option==0){
    System.out.println("shake every day");
        }else if(option==1)
        { System.out.println("vodapay");
        
        }else if(option==2){
            System.out.println("balance");
        }else if(option==3){
            System.out.println("balance");
        }else{
            System.out.println("invalid option");
        
    }
 
    
            
     
            
        }     

}
     
    
