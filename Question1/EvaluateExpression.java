package Question1;

import java.util.Scanner;

public class EvaluateExpression 
{
	static numberStack operand = new numberStack();
	static operatorStack operator = new operatorStack();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the infix expression : ");
		String str = sc.nextLine();

		String returnString = evaluateValue(str);

		System.out.println("String after evaluation is : " + returnString);
		sc.close();
	}

	static String evaluateValue(String str)
	{
		operator.push('#');
		int i = 0 ;
		while( i < str.length() ) 
		{
			// for white spaces and tabs to avoid them
			if( str.charAt(i) == 32 ) 
			{
				i++;
			}
			else 
			{
				if( Character.isDigit(str.charAt(i)) ) 
				{
					String num = "";
					while( i<str.length() && Character.isDigit(str.charAt(i)) ) 
					{
						num += str.charAt(i);
						i++;
					}
					int num1 = Integer.parseInt(num);
					operand.push(num1);
				} 
				else 
				{

					if( isOperator( str.charAt(i) ) ) 
					{
						String opt = "";
						while( i<str.length() && isOperator(str.charAt(i)) ) 
						{
							opt += str.charAt(i);
							i++;
						}
						if( isValidOperator(opt) ) 
						{
							if( prece(opt)>prece(Character.toString(operator.peek())) )
							{
								char optChar[] = opt.toCharArray();
								for(int ii = 0; ii < opt.length() ;ii++)
									operator.push(optChar[ii]);
							} 
							else 
							{
								while( prece(opt)<=prece(Character.toString(operator.peek())))
										{
									String value = operation( Integer.toString((operand.pop())),Integer.toString(operand.pop()),Character.toString(operator.pop()) );
									
									if(value.equalsIgnoreCase("error")) 
									{
										System.out.println("There is an error while performing the operation");
										return "Error";
									}
									operand.push(Integer.parseInt(value));
								}
								char optChar[] = opt.toCharArray();
								for(int ii = 0; ii < opt.length() ;ii++)
									operator.push(optChar[ii]);
							}
						}
						else 
						{
							System.out.println("Operator is not valid.");
						}
					}
				}
			}
		}

		while( operator.peek()!='#' ) 
		{
			String value = operation( Integer.toString((operand.pop())),Integer.toString(operand.pop()),Character.toString(operator.pop()) );
			operand.push(Integer.parseInt(value));
		}
		return Integer.toString(operand.pop());
	}

	static String operation( String b, String a, String op ) 
	{
		switch( op ) 
		{
		case "+":
			String str = Integer.toString( Integer.parseInt(a) + Integer.parseInt(b) );
			return str;
		case "-":
			str = Integer.toString( Integer.parseInt(a) - Integer.parseInt(b) );
			return str;
		case "*":
			str = Integer.toString( Integer.parseInt(a) * Integer.parseInt(b) );
			return str;
		case "/":
			str = Integer.toString( Integer.parseInt(a) / Integer.parseInt(b) );
			return str;
		case "==":
			if( isInteger(a) && isInteger(b) ) 
			{
				if( Integer.parseInt(a) == Integer.parseInt(b) ) 
				{
					return "true";
				}
				else 
				{
					return "false";
				}
			}
			else if( isBoolean(a) && isBoolean(b) ) 
			{
				if( a.equalsIgnoreCase(b) )
				{
					return "true";
				} 
				else 
				{
					return "false";
				}
			}
			else 
			{
				return "error";
			}
		case "<":
			if( Integer.parseInt(a) < Integer.parseInt(b) )
			{
				return "true";
			}
			return "false";
		case ">":
			if( Integer.parseInt(a) > Integer.parseInt(b) ) 
			{
				return "true";
			}
			return "false";
		case ">=":
			if( Integer.parseInt(a) >= Integer.parseInt(b) )
			{
				return "true";
			}
			return "false";
		case "<=":
			if( Integer.parseInt(a) <= Integer.parseInt(b) ) 
			{
				return "true";
			}
			return "false";
		case "!=":
			if( Integer.parseInt(a) != Integer.parseInt(b) ) 
			{
				return "true";
			}
			return "false";
		case "&&":
			if( isBoolean(a) && isBoolean(b) ) 
			{
				if( Boolean.parseBoolean(a) && Boolean.parseBoolean(b) )
				{
					return "true";
				} 
				return "false";
				
			}
			return "error";
		case "||":
			if( isBoolean(a) && isBoolean(b) ) 
			{
				if( Boolean.parseBoolean(a) || Boolean.parseBoolean(b) ) 
				{
					return "true";
				} 
				return "false";
				
			}
			return "error";
		default :
			System.out.println("No such operator possible");
			return "error";
		}

	}
	
	static boolean isInteger(String checkInt) 
	{
		try 
		{
	        Integer.parseInt(checkInt);
	    } 
		catch (NumberFormatException nfe)
		{
	        return false;
	    }
		return true;
	}

	static boolean isBoolean(String checkBool)
	{
		if( checkBool.equalsIgnoreCase("true") || checkBool.equalsIgnoreCase("false") ) 
		{
			return true;
		}
		return false;
	}

	static boolean isOperator(char ch) 
	{
		if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='<' || ch=='>' || ch=='!' || ch=='&' || ch=='|' || ch=='=' ) 
		{
			return true;
		}
		return false;
	}

	static boolean isValidOperator(String var)
	{
		if( var.equalsIgnoreCase("+") || var.equalsIgnoreCase("-") || var.equalsIgnoreCase("*") || var.equalsIgnoreCase("/") || var.equalsIgnoreCase("==") || var.equalsIgnoreCase("!=") || var.equalsIgnoreCase("<=") || var.equalsIgnoreCase(">=") || var.equalsIgnoreCase("&&") || var.equalsIgnoreCase("||") || var.equalsIgnoreCase("<") || var.equalsIgnoreCase(">") ) 
		{
			return true;
		}
		return false;
	}

	static int prece(String op) 
	{
		switch(op)
		{
		case "*":
		case "/":
			return 7;
		case "+":
		case "-":
			return 6;
		case "<":
		case ">":
		case "<=":
		case ">=":
			return 5;
		case "==":
		case "!=":
			return 4;
		case "&&":
			return 3;
		case "||":
			return 2;
		case "#":
			return 0;
		default :
			System.out.println("Not a valid operator");
			return -1;

		}
	}
}