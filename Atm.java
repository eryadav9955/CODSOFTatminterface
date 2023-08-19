import java.util.*;

class Atm {

  public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  Atm obj = new Atm();
  
  
  

int withdraw = 0;
int pin = 0;
int bal = 0;
int button = 0;
  
  System.out.print("Create MPIN:");
   pin = input.nextInt();
   
   System.out.println("\n");
  
   
 for(int y = 0; y<=17;y++){
 System.out.print("-");
 Atm.timeB();
 
 }
 
 
 
 System.out.print("W");
 Atm.timeB();
 System.out.print("E");
 Atm.timeB();
 System.out.print("L");
 Atm.timeB();
 System.out.print("C");
 Atm.timeB();
 System.out.print("O");
 Atm.timeB();
 System.out.print("M");
 Atm.timeB();
 System.out.print("E");
 Atm.timeB();
 

 
 for(int y = 0; y<=17;y++){
 System.out.print("-");
 
 Atm.timeB();
 }
 
 
 System.out.println();
 
   
   System.out.print("Enter MPIN:");
   int mpin = input.nextInt();
  
   
   while(mpin != pin){
   System.out.println();
   System.out.println("INCORRECT! PLEASE  TRY AGAIN.");
    System.out.print("Enter MPIN:");
     mpin = input.nextInt();
   }

   
   System.out.print("\n");
   
   while(button!= 4){
   System.out.println("1.Balance");
   System.out.println("2.Withdraw");
   System.out.println("3.Cash in");
   System.out.println("4.Exit");
   
   
    button = input.nextInt();
    
   
   switch (button){
   case 1:
   System.out.print("Balance:"+ bal);
   System.out.println();
   break;
   

   case 2:
   System.out.print("Withdraw:");
   withdraw = input.nextInt();
   
   
   if(bal <= withdraw || bal <= 0){
     System.out.println("Insufficient balance!");
     System.out.println();
     break;
   }else{
     bal = bal - withdraw;
     System.out.print("Loading");
   for(int i = 1; i<=4; i++){
   System.out.print(".");
   Atm.timeA();
   }
     System.out.println("Successful!");
     System.out.println();
   }
   
   break;
 
  
   case 3:
   System.out.print("Cash in:");
   bal = input.nextInt();
   System.out.print("Loading");
   for(int i = 1; i<=4; i++){
   System.out.print(".");
   Atm.timeA();
   }
   System.out.println("Successful!");
  System.out.println();
  
   break;
   
   case 4:
   System.out.println("DONE!");
   System.out.println("Please leave a star 🥺");
   break;
   
     default:
     System.out.println();
     System.out.println("Invalid keyword!");
     System.out.println("Please, try again");
     System.out.println();
     
     
     
   
   }
   }
   }
   
  public static void timeA(){
     try{
     
     Thread.sleep(1000);
       
     }catch(Exception e){
       
     }
   }
   
   public static void timeB(){
     try{
     
     Thread.sleep(100);
       
     }catch(Exception e){
       
     }
   }
  




}