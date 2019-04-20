package ly.spring.first.main;

import ly.spring.first.dtos.Address;

public class MainApplicationAdd {

	public static void main(String[] args) {
	
		Address ad=new Address();
		ad.setAddressLine1("512 Oscar Loop");
		ad.setAddressLine2("APT-104H");
		ad.setCity("Newport News Kingstone");
		
		ad.setState("Virginia");
		ad.setZipcode(23606);
		
		
		

	}

}
