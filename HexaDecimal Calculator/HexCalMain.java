import java.util.Scanner;


class HexCalMain {
	public static void main(String args[])
	{
    HexCal calculate = new HexCal();

    menu(calculate);
    
	}
    private static int getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.println( "1.Convert Hexadecimal To Decimal\n"+ 
                "2.Convert Decimal To Hexadecimal\n"+
                "3.Add Two Hexadecimal Numbers\n"+
                "4.Substract Two Hexadecimal Numbers\n"+
                "5.Multiply Two Hexadecimal Numbers\n"+ 
                "6.Divide Two Hexadecimal Numbers\n"+
                "7.Compare Two Hexadecimal Numbers\n"+ 
                "8.Nothing");
        System.out.println("Enter your choice ");
        
        int value = in.nextInt(); 
       
        return value;
    }

    public static void menu(HexCal calculate) {
    	while (true)
    	{
            int choice = getUserInput();
            switch (choice) {
            case 1:
                convertHexToDec(calculate);
                break;
            case 2:
                convertDecToHex(calculate);
                break;
            case 3:
                addTwoHex(calculate);
                break;
            case 4:
                substractTwoHex(calculate);
                break;
            case 5:
                multiplyTwoHex(calculate);
                break;
            case 6:
                divideTwoHex(calculate);
                break;
            case 7:
                compareTwoHex(calculate);
            case 8:
                System.exit(0);
                break;
            default:
                break;
            }
        } 
    }

    private  static void convertHexToDec(HexCal calculate) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter HexaDecimal Number ");
    	String hexNumber = in.nextLine();
        int decimalNumber = calculate.hexadecimalToDecimal(hexNumber);
        System.out.println("The Decimal Number is "+ decimalNumber);
    }

    private  static void convertDecToHex(HexCal calculate) 
    {
    	Scanner in = new Scanner(System.in);
        System.out.println("Enter Decimal Number ");
    	String inputNumber = in.nextLine();
        int decimalNumber = Integer.parseInt(inputNumber);
        System.out.println( "The Hexadecimal Number is  "+ calculate.decimalToHexadecimal(decimalNumber));
    }

    private  static void addTwoHex(HexCal calculate) 
    {	
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter First HexaDecimal Number ");
        String firstHexNumber = in.nextLine();
        System.out.println("Enter Second HexaDecimal Number ");
        String secondHexNumber = in.nextLine();
        System.out.println( "The Sum Of Two Hexadecimal Number is " + calculate.addHexadecimalNumbers(firstHexNumber, secondHexNumber));
    }

    private  static void substractTwoHex(HexCal calculate) 
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter First HexaDecimal Number ");
    	String firstHexNumber = in.nextLine();
    	System.out.println("Enter Second HexaDecimal Number ");
        String secondHexNumber = in.nextLine(); 
        System.out.println( "The Difference Of Two Hexadecimal Number is " + calculate.substractHexadecimalNumbers(firstHexNumber, secondHexNumber));
    }

    private static void multiplyTwoHex(HexCal calculate)
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter First HexaDecimal Number ");
    	String firstHexNumber = in.nextLine();
    	System.out.println("Enter Second HexaDecimal Number ");
        String secondHexNumber = in.nextLine();
        System.out.println( "The Multiplication Of Two Hexadecimal Number is " + calculate.multiplyHexadecimalNumbers(firstHexNumber, secondHexNumber));
    }

    private  static void divideTwoHex(HexCal calculate) 
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter First HexaDecimal Number ");
    	String firstHexNumber = in.nextLine();
    	System.out.println("Enter Second HexaDecimal Number ");
        String secondHexNumber = in.nextLine();
        System.out.println("The Division Of Two Hexadecimal Number is " + calculate.divideHexadecimalNumbers(firstHexNumber, secondHexNumber));
    }

    private static void compareTwoHex(HexCal calculate) {
        int value ;
        Scanner in = new Scanner(System.in);
    	System.out.println("Enter First HexaDecimal Number ");
    	String firstHexNumber = in.nextLine();
    	System.out.println("Enter Second HexaDecimal Number ");
        String secondHexNumber = in.nextLine();
        
        System.out.println( "1.Two Hexadecimal Numbers Are Equal?/n"+
                "2.First Hexadecimal Number Is Greatr Than Second/n"+
                "3.First Hexadecimal Number Is Less Than Second?/n"+  
        		"Enter Your Choice ");
        value = in.nextInt();
        switch (value) {
        case 1:
        	System.out.println( calculate.CompareEqual(firstHexNumber, secondHexNumber));
            break;
        case 2:
        	System.out.println( calculate.CompareGreaterThan(firstHexNumber, secondHexNumber));
            break;
        case 3:
        	System.out.println( calculate.CompareLessThan(firstHexNumber, secondHexNumber));
            break;
        default:
            break;
        } 

    }

}