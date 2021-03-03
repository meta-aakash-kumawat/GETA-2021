
class HexCal {
	
	/**
	 * To Convert Decimal number to hexadecimal number
	 * @param decimalNumber given decimal number
	 * @return will return the respective hexadecimal number
	 */
    public String decimalToHexadecimal(int decimalNumber) 
    {
    	int remiander;
    	String hexaDecimalNumber = "";
    	char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    	while(decimalNumber > 0)
    	{
    		remiander = decimalNumber % 16;
    		hexaDecimalNumber = hexchars[remiander] + hexaDecimalNumber;
    		decimalNumber = decimalNumber/16;
    	}
    	return hexaDecimalNumber;
    	 
    }
    
    /**
	 * To Convert Hexadecimal number to decimal number
	 * @param hexadecimalNumber given hexadecimal number
	 * @return will return the respective decimal number
	 */
    public int hexadecimalToDecimal(String hexadecimalNumber) 
    {
        
        String digits = "0123456789ABCDEF";
        int decimalNumber = 0;
        hexadecimalNumber = hexadecimalNumber.toUpperCase();
        for(int i = 0; i< hexadecimalNumber.length(); i++)
        {
        	char c = hexadecimalNumber.charAt(i);
        	int d = digits.indexOf(c);
        	decimalNumber = 16*decimalNumber + d;
        }
        return decimalNumber;
        
    }
    
    /**
     * To compare two hexadecimal number whether they are equal or not
     * @param hexadecimalNumberA given hexadecimal number 1
     * @param hexadecimalNumberB given hexadecimal number 2
     * @return true or false
     */
    public boolean CompareEqual(String hexadecimalNumberA, String hexadecimalNumberB) {
        hexadecimalNumberA.toLowerCase();
        hexadecimalNumberB.toLowerCase();
        if (hexadecimalNumberA.equals(hexadecimalNumberB)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * To compare two hexadecimal number for number one  is greater than 2nd number or not
     * @param hexadecimalNumberA given hexadecimal number 1
     * @param hexadecimalNumberB given hexadecimal number 2
     * @return true or false
     */
    public boolean CompareGreaterThan(String hexadecimalNumberA, String hexadecimalNumberB) {
        hexadecimalNumberA.toLowerCase();
        hexadecimalNumberB.toLowerCase();
        if (hexadecimalNumberA.length() > hexadecimalNumberB.length()) {
            return true;
        } else if (hexadecimalNumberA.length() == hexadecimalNumberB.length()
                && hexadecimalNumberA.compareTo(hexadecimalNumberB) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * To compare two hexadecimal number for number one  is smaller than 2nd number or not
     * @param hexadecimalNumberA given hexadecimal number 1
     * @param hexadecimalNumberB given hexadecimal number 2
     * @return true or false
     */
    public boolean CompareLessThan(String hexadecimalNumberA, String hexadecimalNumberB) {
        hexadecimalNumberA.toLowerCase();
        hexadecimalNumberB.toLowerCase();
        if (hexadecimalNumberA.length() > hexadecimalNumberB.length()) {
            return false;
        } else if (hexadecimalNumberA.length() == hexadecimalNumberB.length()
                && hexadecimalNumberA.compareTo(hexadecimalNumberB) >= 0) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * To add two hexadecimal numbers
     * @param hexadecimalNumberA given hexadecimal number 1
     * @param hexadecimalNumberB given hexadecimal number 2
     * @return Will return sum of two numbers
     */
    public String addHexadecimalNumbers(String hexadecimalNumberA, String hexadecimalNumberB) {

        int decimalNumberA = hexadecimalToDecimal(hexadecimalNumberA);
        int decimalNumberB = hexadecimalToDecimal(hexadecimalNumberB);

        return decimalToHexadecimal(decimalNumberA + decimalNumberB);

    }

    /**
     * To Substract two hexadecimal numbers
     * @param hexadecimalNumberA given hexadecimal number 1
     * @param hexadecimalNumberB given hexadecimal number 2
     * @return Will return substraction of two numbers
     */
    public String substractHexadecimalNumbers(String hexadecimalNumberA, String hexadecimalNumberB) {

        int decimalNumberA = hexadecimalToDecimal(hexadecimalNumberA);
        int decimalNumberB = hexadecimalToDecimal(hexadecimalNumberB);
        if (decimalNumberA > decimalNumberB) {
            return decimalToHexadecimal(decimalNumberA - decimalNumberB);
        } else {
            return decimalToHexadecimal(decimalNumberB - decimalNumberA);
        }
    }

    /**
     * To multiply two hexadecimal numbers
     * @param hexadecimalNumberA given hexadecimal number 1
     * @param hexadecimalNumberB given hexadecimal number 2
     * @return Will return multiply of two numbers
     */
    public String multiplyHexadecimalNumbers(String hexadecimalNumberA, String hexadecimalNumberB) {

        int decimalNumberA = hexadecimalToDecimal(hexadecimalNumberA);
        int decimalNumberB = hexadecimalToDecimal(hexadecimalNumberB);

        return decimalToHexadecimal(decimalNumberA * decimalNumberB);

    }

    /**
     * To divide two hexadecimal numbers
     * @param hexadecimalNumberA given hexadecimal number 1
     * @param hexadecimalNumberB given hexadecimal number 2
     * @return Will return division of two numbers
     */
    public String divideHexadecimalNumbers(String hexadecimalNumberA, String hexadecimalNumberB) {

        int decimalNumberA = hexadecimalToDecimal(hexadecimalNumberA);
        int decimalNumberB = hexadecimalToDecimal(hexadecimalNumberB);

        if (decimalNumberA > decimalNumberB && decimalNumberA % decimalNumberB == 0) {
            return decimalToHexadecimal(decimalNumberA / decimalNumberB);
        } else {

            return ("Try Another Pare Of Hexadecimal Numbers, First Number is smaller than Second Or Result Is Not Integer Number");

        }
    }
}
