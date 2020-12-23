import java.util.Random;
import java.util.*;
class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  /*int n=454;//It is the number variable to be checked for palindrome  
  Random rand = new Random(); 

   Generate random integers in range 0 to 999 
  
  int n = rand.nextInt(10000);
  System.out.println(" number "+n+" is"); */
  Scanner in= new Scanner (System.in);    //System.in is a standard input stream
  System.out.print("Enter the number- ");  
  int n= in.nextInt();  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}