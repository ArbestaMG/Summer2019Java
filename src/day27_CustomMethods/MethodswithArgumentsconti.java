package day27_CustomMethods;

public class MethodswithArgumentsconti {
public static void main(String[] args) {
	remover("aaaccvvvvereq");
}


	public static void remover(String str) {
	String str1=" ";
	
		for(int i=0;i<str.length();i++)	{
			if(!str1.contains(str.substring(i, i+1))) {
				str1+=str.substring(i,i+1);
				
			}
		}System.out.println(str1);
}
}