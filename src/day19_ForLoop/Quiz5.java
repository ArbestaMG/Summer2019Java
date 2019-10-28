package day19_ForLoop;

public class Quiz5 {
public static void main(String[] args) {
	String ta="A ";
	ta=ta.concat("B ");
	String tb="C ";
	ta=ta+tb;
	ta.replace("C","D");
	ta=ta+tb;
	System.out.println(ta);
	
	
	
	String str=" ";
	str.trim();
	boolean A=str.isEmpty();
	System.out.println(A);
}
}
