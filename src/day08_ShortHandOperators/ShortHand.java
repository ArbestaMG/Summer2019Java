package day08_ShortHandOperators;

public class ShortHand {
	public static void main(String[] args) {
		/*
		 += : addition assignment x+=y means x=x+y
		 -=	: subtraction assignment x-=y means x=x-y
		 *= :multiplication assigment x*=y means x=x*y
		 *%=:remainder assignment
		 */
		
		
		int a=9;
			a=a+3;
			System.out.println(a); //12
			
		int a1=9;
			a1+=3;
		System.out.println(a1);  //12
		
		int b=a1+=5;	//a1=17 ,b=17
		System.out.println(b); //17
		
		int c=a1+=b; //a1=34, c=34, b=17
		System.out.println(c); // 34
		
		int d=a1+=c; // a1=68, c=34, d=68
		System.out.println(d);
		
		int e=(d+=b)*2; // d=85,b=17,e=170
		System.out.println(e); //170
		
		int f= b+=d*2; //b+=170//f=187//b=187;
		System.out.println(f);  //187
		
		
		//-=:
		
		int g=101;
		int h=g-=1; // h=100, g=100;
		System.out.println(h);  //100
		System.out.println(g);  //100
		
		int i=g+=h+5; // i=205,g=205,h=100
		System.out.println(i); //105
		
		int j=h+=g%i;//j=h+100;
		System.out.println(j);
		
		int k=j-=h*2%5; //j=100
		//	   j-=200%5;
		//		
		System.out.println(k); // 100
		
		// *=:
		
		int A=100;
		A*=200;
		System.out.println(A); //20_000
		
		int B=100;
			B*=100/10;
			System.out.println(B); //1000
			
		B*=B-=1000; // B*(0)
		System.out.println(B); //0
		
		B*=B-1000; // B*(0)
		System.out.println(B); //0
		
		
		// /=:
		
		int C =1000;
		C=C/5;
		System.out.println(C); //200
		
		int D=10;
		//C/D-10; denominator can not be zero
		
		C/=D+10; // C 20 ile bolunmus oluyor
		System.out.println(C);
		
		//  %= 
		int z=10%3;
		System.out.println(z); //1
		
		int E=10;
		E%=2; //E=10%2;
		System.out.println(E); //0
		
		int F=100;
			F%=2; // F= F%2; 0
		System.out.println(F);
		
		System.out.println(-100%3);//-1
		System.out.println(10.5%3); //1.5
		
		
	}

}
