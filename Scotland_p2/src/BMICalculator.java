import java.util.*;

public class BMICalculator {
	private double userW = 0; 
	private double userH = 0;
	private String BmiCat = "";
	private String BMIstat = "";
	private double BMIval = 0;
	private double inchesH = 0;
	private Scanner inputScr = new Scanner(System.in);

	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBMI();
		app.displayBMI();
	}
	public void readUserData()
	{
		System.out.println("***************************************************");
		System.out.println("******** Body Mass Index (BMI) Calculator  ********");
		System.out.println("***************************************************");
		System.out.println("\n");
	        while (true)
		{
			System.out.print("Do you want calculate BMI by Pounds(P) or Kilograms(K) or exit(X)? ");
			char inputChar = inputScr.next().charAt(0);
			if (Character.isLetter(inputChar))
			{
				String inputStr = Character.toString(inputChar);
				inputStr = inputStr.toUpperCase();
				switch (inputStr)
				{
					case "P":
						BmiCat = "P";												
						break;
					case "K":
						BmiCat = "K";
						break;
					case "X":
			            System.exit(0);			        
	            }
				if ((BmiCat == "P")||(BmiCat == "K"))
				{
					chkWeight();					
					chkHeight();
					break;
				}			 
			}			
		}		
	}
	public void calculateBMI()
	{
		inchesH = userH * 12;
		switch (BmiCat)
		{
			case "P":
				BMIval = (703 * userW) / Math.pow(inchesH, 2.0);				
				break;
			case "K":
				double winKilos = userW * 0.453592;
				double hinMeters = inchesH * 0.0254;
				BMIval = winKilos / Math.pow(hinMeters, 2.0);	
				break;			        
        	}	
	}
	public void displayBMI()
	{
		if (BMIval < 18.5 ) {
			BMIstat = "Your BMI status is Underweight";
        	}
        	else if ((BMIval >= 18.5) && (BMIval < 25)) {
            		BMIstat = "Your BMI status is Normal";
        	}
        	else if ((BMIval >= 25) && (BMIval < 30)) {
        		BMIstat = "Your BMI status is Overweight";
        	}
        	else if (BMIval >= 30) {
        		BMIstat = "Your BMI status is Obese";
        	}
		System.out.println("\n");
		if (BmiCat == "P")
		{
			System.out.println("Your Weight is: " + userW + " lbs");
			System.out.println("Your Height is: " + userH + " ft");
		}else
		{
			double winKilos = userW * 0.453592;
			double hinMeters = inchesH * 0.0254;
			System.out.println("Your Weight is: " + winKilos + " klg");
			System.out.println("Your Height is: " + hinMeters + " mts");
		}
		System.out.println("Your BMI is: "+BMIval);
		System.out.println(BMIstat + "\n");
		System.out.println("Have a nice day !!");
	}
	public void chkWeight()
    	{
		int startP = 0;
		while (startP == 0)
		{
			System.out.print("Enter your Weight in Pounds (example 224)? ");						
			userW = inputScr.nextDouble();
			if(userW < 20)
			{
				System.out.print("***Error Your weight can not be less than 20 \n");
			}
			else 
			{startP = 1;}				
		}
   	 }
	public void chkHeight()
    	{
		int startP = 0;
		while (startP == 0)
		{
			System.out.print("Enter your Height in Feet (example 5.8)? ");						
			userH = inputScr.nextDouble();
			if(userH < 3)
			{
				System.out.print("***Error Your Height can not be less than 3 \n");
			}
			else 
			{startP = 1;}				
		}
    	}
}