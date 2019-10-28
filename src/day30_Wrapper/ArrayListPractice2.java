package day30_Wrapper;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPractice2 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer>evenlist=new ArrayList<>();
		 for(int i=0; i<=40;i++) {
			 if(i%2!=0)
				 continue;
			evenlist.add(i);
		 }System.out.println(evenlist);
		 System.out.println(evenlist.size());
		 System.out.println(evenlist.get(4));
	
		 System.out.println();
		 for(int i=0;i<evenlist.size();i++) {
			 System.out.print(evenlist.get(i)+" ");
		 }
		 
		 System.out.println();
		 
		 for(Integer each:evenlist) {// burada integer yerine int te yazabiliriz. bu zaman unboxing olur
			 System.out.print(each+" ");}
		 
		 System.out.println();
		 
		 int num=evenlist.get(7);//unboxing.coz there is no primitives in arraylist
		 System.out.println(num);
		 
		 //evenlist.clear();
		 //System.out.println(evenlist);// get yazip deger verirsek hata verir
		 
		 
		 //SORTING THE ARRAYLIST
		 Collections.sort(evenlist);
		 System.out.println(evenlist);
		 
		 
		 
		 ArrayList<Integer>list2=new ArrayList<>();
		 for(int i=200;i>=0;i--) {
			 list2.add(i);
		 }
		 System.out.println(list2);
		 Collections.sort(list2);
		 System.out.println(list2);
		 
	}
}
