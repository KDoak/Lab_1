import java.util.Scanner;
// Lab1 created by: Kevin Doak, Issac Chouri, and Victor Forman
public class Savings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of years you plan on working for.");
		double yearsWorked = input.nextDouble()*12; //Taking variable for years worked.
		
		double annualReturnInput;
		do{
		System.out.println("Enter the % rate your saved money should grow by per year before retirement. ");
		annualReturnInput = input.nextDouble(); //Taking variable for amount put in annual return.
		}while (annualReturnInput <=0 || annualReturnInput >20); //Checks for correct % amount between 0-20.
		annualReturnInput= annualReturnInput/100/12;
	
		System.out.println("Enter how long you plan to be retired for.");
		double yearsRetired = input.nextDouble()*12; //Taking variable for years retired.
		
		double annualReturnOutput;
		do{
		System.out.println("Enter the % rate your saved money should grow by per year once retired.");
		annualReturnOutput = input.nextDouble(); //Taking variable for amount taken out of annual return.
		}while (annualReturnOutput <=0 || annualReturnOutput >3); //Checks for correct % amount between 0-3
		annualReturnOutput= annualReturnOutput/100/12;
		
		System.out.println("Enter the income you will need monthly during retirement.");
		double requiredIncome = input.nextDouble(); //Taking variable for required income post-retirement.
		
		System.out.println("Enter the expected amount you will recieve in Social Security monthly.");
		double socialSecurity = input.nextDouble(); //Taking variable for monthly income from social security.
		input.close();
		double sum = requiredIncome - socialSecurity;//Created to make calculating easier.
		
		double totalSavings = (sum*(((1-1/(Math.pow(1+annualReturnOutput, yearsRetired))))))/annualReturnOutput;  
		//Calculating Total Savings.
		double monthlySavings = (totalSavings * annualReturnInput)/((Math.pow(1+annualReturnInput,yearsWorked))-1);
		//Calculating Monthly Savings.
		System.out.printf("You will need to save a total of: $%.2f\n",totalSavings);
		System.out.printf("Monthly Payments needed: $%.2f",monthlySavings);
		
		//Testing for github
	}

}
