package day53_Interface;

public class Jeep_Wrangler implements Cars,GasVehicles{

	@Override
	public void Pumpgas() {
	System.out.println("Pumping Gas for Wrangler");
		
	}

	@Override
	public void start() {
	System.out.println("Call Mechanic,Wrangler is broken");
	System.out.println("Oil change for Wrangler");
	}

}
