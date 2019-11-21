package day53_Interface;

public class Tesla_Model3 implements Cars, ElectricVehicles{

	public void start() {
		System.out.println("Voice Control\" Tesla Start \"");
	}
	
	public void Charge() {
		System.out.println("Charging Teslaaaa");
	}
	
	public void SelfDriver() {
		System.out.println("Self Driving Mode in on Tesla");
	}

	@Override
	public void fly() {
		System.out.println("Tesla take it ez, stop flying");
		
	}

	
		
	
}
