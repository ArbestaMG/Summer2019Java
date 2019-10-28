package day43_JavaRecap;

public class Static_Ins_Constructor {
static {
	System.out.println("Static Block");//executed as soon as the class is loaded. obje olmasa da run olur
}
{
	System.out.println("Instance Block");//ececuted when objects is created
}

public Static_Ins_Constructor(){
	System.out.println("Constructor");//executed when object is created
}
	public static void main(String[] args) {
		Static_Ins_Constructor obj=new Static_Ins_Constructor();
	}

}
