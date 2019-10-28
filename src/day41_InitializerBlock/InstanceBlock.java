package day41_InitializerBlock;

public class InstanceBlock {
	{// burasi instance block , buranin executiond depends on the creation of object
		System.out.println("instance block");
	}
	
	public InstanceBlock() {
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		InstanceBlock obj1=new InstanceBlock();
		InstanceBlock obj2=new InstanceBlock();
	
	
	}

}
