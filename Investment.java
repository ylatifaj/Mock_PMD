import java.util.Scanner;

public class Investment{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int money[] = new int[6];
        int years = 4;
        double interest = 4.3/100;
        int number;

        do{
            System.out.println("Welcome to the investments program");
            System.out.println("1. Enter the initial amount of money for 6 investments and store them inside an array");
            System.out.println("Calculate and print the total amounts for each investment of the array");
            System.out.println("Enter 1 or 2 (or anything else)");
            number = scan.nextInt();
            switch(number){
                case 1: 
                    fillArrayInvestments(money);
                    break;
                case 2:
                    calculateAndPrint(money, years, interest);
            }

        }while(number == 1 || number ==2);

        // while(number != 1)
       
        
        

    }

    public static double invest (int money, int years, double interest)
    {
        double ROI;
        return ROI = (money * (1 + (years * interest)));
        
        
       
    }

    public static void fillArrayInvestments (int money[])
    {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < money.length; i++)
        {
            do {
                System.out.println("Enter the " + (i+1) + " investment");
                money[i] = scan.nextInt();
            }while (money[i] < 0);
        }
    }

    public static void calculateAndPrint(int money[], int years, double interest)
    {
        
        for (int i = 0; i < money.length; i++)
        {
            System.out.println("The total amount for investment number " + (i+1) + " is " + invest(money[i], years, interest));
        }
    }
}