package day11_IfStatement_Review;

public class Review {
	public static void main(String[] args) {
		
		/*
		 warm up
		 1) decleare a int variable called "year"
		 2)write a program that is a leap year // leap year can bu diveded by 4
		 */
		
		int year=2011;
		if(year%4==0) {System.out.println("Thats a leap");}
		else {System.out.println("No, thats not a leap");}
		
		
		
		/*
		 ELSE STATEMENT MUST BE DECLEARED WITH IF STATEMENT.
		 
		 Else if: 
		 if(condition1){
		 }else if(condition2){
		 }else if (condition3){
		 }else{
		 */
		
		/*
		 TASK: 
		 A== 90-100
		 B== 80-89
		 C== 70-79
		 D== 60-69
		 F== 0-59
		 
		 */
		
		int grade=11;
		boolean A= grade>=90 && grade<=100;
		boolean B =grade>=80 && grade<=89;
		boolean C =grade>=70 && grade<=79;
		boolean D =grade>=60 && grade<=69;
		boolean Valid= grade>=0 && grade<=100;
		
		
	if(Valid) {///// burada if valid oolursa asagidaki seviyelere geceriz yoksa direk else olur.
		if (A) {System.out.println("AA");}
		else if(B) {System.out.println("BB");}
		else if(C) {System.out.println("CC");}
		else if(D) {System.out.println("DD");}
		else {System.out.println("FF");}
		}
	else  {System.out.println("not graded yet");}
	
	/*
	 if (condition1) { //A
	 	if (condition2){//B           // B A'ya bagli
	 	}}
	 */
	
	
	// 
	int age=133;
	boolean goodperson=false;
	if(age>=18) {
		if(goodperson) {
			System.out.println("alcohol is bad");}
		else { // here age >18 and goodperson=false
			System.out.println("you can buy cigarette");
			if(age>=21) {
				System.out.println("you can buy hookah");}
			if(age>=25) {System.out.println("you can buy alcohol");} // else if yaparsak asla alkol alamayabilir
			}
		
		
		
	}else {
		System.out.println("Milk");}
	
	
	
	/*
	 Program that find number of days in a month(assume that february is 28days)
	 int month=0-12;
	 
	 */
	int month=2;
	int year1=1009;
	if (month >0 && month<12) {
		if(month ==2) {
			if(year1%4==0) {System.out.println("29 days");}
			else {System.out.println("28 days");}}
		
		else if((month)==(4) || (month)==(6) || (month)==(9)|| (month)==(11)) {System.out.println("30 days");}
		else {System.out.println("31days");}
		
		
		
	} else {System.out.println("invalid month");}
	
	
	
	if(false) {System.out.println("heeey");}
	else {System.out.println("batch1");}
	
	if(false) {System.out.println("hello");}
	else if(false) {
		System.out.println("batch2");}// never gets executed
	else {System.out.println("cybertek");
	}
	
	
	int x=11;
	if(x>0) {System.out.println("greater than 0");}
	if(x>5) {System.out.println("greter than 5");}
	if (x>10) {System.out.println("greater than 10");}
	
	int x1=11;
	if(x>10) {System.out.println("greater than 0");} // burada sadece bir tanesi execute oluyor
	else if(x1>5) {System.out.println("greter than 5");}
	else if (x1>10) {System.out.println("greater than 10");}
	
	if(true) {} // oonly be used for 1 condition
	
	
	if(true) {} // for 2 options
	else {}
	
	if(true) {} // more than 2 options
	else if(true) {}
	else if(true) {}
	else {}
	
	
	if (true) { // burada ilk if conditions multiple senaryosu var
		if(true) {}} /// bunun olmasi ilk if e bagli
	
	}
	
	}


