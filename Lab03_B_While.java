import java.util.*;

public class Lab03_B_While.java {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
    
    int firstNum;
    int secondNum;
    int currentNum;
            
    System.out.println( "Input the first number:");
    firstNum = console.nextInt();
    
    currentNum=firstNum;
    
    System.out.println( "Input the second number:");
    secondNum = console.nextInt();
    
    System.out.println( "All odd numbers between " + firstNum + " and " + secondNum + " inclusive");
    while (currentNum <= secondNum){ 
        if (currentNum %2 == 1) {
         System.out.println(currentNum);
        
        }    
       currentNum = currentNum + 1;
     }
    System.out.println("Sum of all even numbers between " + firstNum + " and" + secondNum + " inclusive");
    
    int sum = 0;
    currentNum = firstNum;
    while (currentNum <= secondNum){ 
        if (currentNum %2 == 0) {
          sum = (sum + currentNum);
        }    
      currentNum = currentNum + 1;
    }
        
    System.out.println(sum);
    }
}    
