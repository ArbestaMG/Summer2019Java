package day53_Interface;

public class Toyota_Hybird implements Cars,ElectricVehicles,GasVehicles {

	@Override
	public void Pumpgas() {
		System.out.println("Pump gas toyota brp");
		
	}

	@Override
	public void Charge() {
		System.out.println("Charge your toyota");
		
	}

	@Override
	public void SelfDriver() {
		System.out.println("No self driver for toyota");
		
	}

	@Override
	public void start() {
		System.out.println("Toyota stars ez");
		
	}

	@Override
	public void fly() {
	System.out.println("TOTO can not fly");
		
	}

}
