import java.util.*;

public class Lab03_B_For.java {

    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
    int firstNum = 1;
    int secondNum = 0;
    int currentNum = 0;
    
    while(firstNum >= secondNum)
    {
        System.out.println( "Input the first number:");
        firstNum = console.nextInt();
    
        currentNum=firstNum;
    
        System.out.println( "Input the second number:");
        secondNum = console.nextInt();
        
        if (firstNum >= secondNum)
        {
            System.out.println("Sorry, your first number must be less than the second.");            
        }
    }
    
    System.out.println( "All odd numbers between " + firstNum + " and " + secondNum + " inclusive");
        for (int i = currentNum; i <= secondNum; i++) {
            if (i %2 == 1)
             System.out.println( i );
        }
    int sum = 0;        
    currentNum = firstNum;
    System.out.println("Sum of all even numbers between " + firstNum + " and " + secondNum + " inclusive");    
        for (int i = currentNum; i <= secondNum; i++ ) {
            if (i %2 == 0)
                sum = (sum + i);
        }
        System.out.println(sum);
    }
}
