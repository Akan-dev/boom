import java.util.Scanner;  
   
public class Sum{
public static void main(String[] args){
  Scanner read = new Scanner(System.in);

 //initializing the variables	
 int sum = 0;
 int number = 0;
 int newNumber = 0;

 System.out.println("Enter the number");
 number = read.nextInt();
 System.out.println("current number is:" + number);
 
  //sum the first values but no loop 
 if(sum >= 0 && number >= 0 && newNumber >= 0){
    System.out.println("Enter the number");
    newNumber = read.nextInt();
    sum = newNumber + number; 
    System.out.println("sum:" + sum);
 }
 else
    System.out.println("You entered a negative number");
 
 
     //loop to repeat the sum of numbers until a negative value is entered
     while(sum >= 0 && number >= 0 && newNumber >= 0){
     System.out.println("Enter the number");
     newNumber = read.nextInt();

        if(sum >= 0 && number >= 0 && newNumber >= 0){
         sum = sum + newNumber;
	     System.out.println("Sum:" + sum);
	}
        else{
	 System.out.println("You entered a negative number");
	 break;
        }
     }
   }
 }
   

