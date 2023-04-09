import java.util.Scanner;


public class Main {

	public int prize = 0;
	
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        
        if(firstNum == secondNum && secondNum == thirdNum)
        {
        	int prize = 10000 + (firstNum * 1000);
        	System.out.println(prize); 
        }
        else if(firstNum == secondNum || secondNum == thirdNum || firstNum == thirdNum)
        {
        	if(firstNum == secondNum) 
        	{
        		int prize = 1000 + (firstNum * 100);
            	System.out.println(prize); 

        	}
        	else if(secondNum == thirdNum)
        	{
        		int prize = 1000 + (secondNum * 100);
            	System.out.println(prize); 

        	}
        	else if(firstNum == thirdNum)
        	{
        		int prize = 1000 + (firstNum * 100);
            	System.out.println(prize); 

        	}
        }
        else if(firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum)
        {
        	if(firstNum > secondNum && firstNum > thirdNum)
        	{
        		int prize = firstNum * 100;
            	System.out.println(prize); 

        	}
        	else if(secondNum > firstNum && secondNum > thirdNum)
        	{
        		int prize = secondNum * 100;
            	System.out.println(prize); 

        	}
        	else 
        	{
        		int prize = thirdNum * 100;
            	System.out.println(prize); 

        	}
        }
    }
}
