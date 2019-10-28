package replits;

import java.util.Scanner;

public class HW60 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    String sentence = scan.nextLine();
    
    boolean A=sentence.contains(word);
    		System.out.println(A);
}
}
