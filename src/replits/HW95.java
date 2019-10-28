package replits;
import java.util.Scanner;

public class HW95 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String str = scan.next();
    
    	
    int firstIndex = 0;
    int lastIndex = 0;
    String word = "";
    int countbread = 0;
    for (int j = 0; j < str.length() - 4; j++) {
        if (str.substring(j, j + 5).equals("bread")) {
            countbread++;
            if (countbread >= 2) {
                firstIndex = str.indexOf("bread");
                lastIndex = str.lastIndexOf("bread");
                word = str.substring(firstIndex + 5, lastIndex);
            }
        }
    }
    if (countbread == 1 || !str.contains("bread")) {
        System.out.println("nothing");
    }
    System.out.println(word);
    scan.close();
}}