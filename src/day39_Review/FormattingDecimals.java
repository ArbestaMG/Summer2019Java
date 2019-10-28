package day39_Review;

import java.text.DecimalFormat;

public class FormattingDecimals {
public static void main(String[] args) {
	
	DecimalFormat formatlanacak=new DecimalFormat("0.000");

	double b=23.23131312312;
	//format(double): formats the decimals and returns you a string value
	
	String num1=formatlanacak.format(b);
	System.out.println(num1);
	
	double c=42.321312312312;
	System.out.println(formatlanacak.format(c));
	
	c=Double.parseDouble(formatlanacak.format(c));//Stringi aldi double a cevirdi
	
}
}
