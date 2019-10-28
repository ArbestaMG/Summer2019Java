package day44_AccessModifiers;

import static day44_AccessModifiers.Import_Statement.*;//* yerine id veya name(diger sinifin variable yazabilirz)
	//         package name          //class name    //variable name
												     // var. name yerine * koyarsak butun hepsi gelir	
public class Test_Import_Statement {
	
public static void main(String[] args) {
	
System.out.println(id);

System.out.println(Import_Statement.name);

System.out.println(age);// default variable oldugu icin direk ayni classtan goruyor
System.out.println(Import_Statement.age);
printHello();
}
}
