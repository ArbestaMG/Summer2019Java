package day18_StringClassContinue;

public class StringClass_Continue {
public static void main(String[] args) {
	
	/*
	 indexOf(str): returns the index number of the first occured character in the given string as an int value
	 */
	
	String a1="Batch 12 is a great batch";
	
	int num=a1.indexOf("g");
	System.out.println(num);// ilk g nin degeri. bosluklarda sayiliyor. 14 oluyor
	
	int num2=a1.indexOf("eat");
	System.out.println(num2);// ilk a nin degerini verdi.
	
	String b1="today is tuesday, today we have class afternoon";
	int num3=b1.indexOf("ter"); // burada ter yazdikc boylece afTERnoon daki t nin indexini bulduk
	System.out.println(num3);
	
	
	String adres=" 7925 jones branch dr, mclearn,va 22003";
	int begin=adres.indexOf(", ")+1+1; // burada sehir adini buluyoruz. o yuzden bosluga 2 ekliyoruz
	int ending=adres.indexOf("n,")+1;// burada +1 yapiyoruz, cunku substrng methounda son hane okunmuyor.
	
	String cityname=adres.substring(begin,ending);
	System.out.println(cityname);
	
	String email="RandomEmails@gmail.com";
	int beg=email.indexOf("@")+1;// +1 yapiyoruz cunku @i dahil etmek istemiyoruz, @ den sonra
	int end=email.indexOf("l.")+1;
	String Realmail=email.substring(beg,end);
	System.out.println(Realmail);
	
	
	/*
	 lastIndexOf(): returns the last occured chareacter index number as and int value
	 */
	
	String str1="ABCDABCD";
	int n1=str1.indexOf("D")+2;
	System.out.println(n1);// burada 2.B yi bulduk. ilk cikan karakteri verir.
	int n2=str1.lastIndexOf("B");
	System.out.println(n2);// burada da 2. b yi bulduk. son cikan karakteri verir
	
	String myemail="Myemail.school@gmail.com";
	int begin1=myemail.indexOf("@")+1;
	
	int ending1=myemail.lastIndexOf("l")+1;// +1 demezsek,l yi saymiyor.
	String Realmyemail=myemail.substring(begin1,ending1);
	System.out.println(Realmyemail);
	
	
	
}
}
