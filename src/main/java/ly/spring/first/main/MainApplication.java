package ly.spring.first.main;

import ly.spring.first.dtos.Customer;

public class MainApplication {

	public static void main(String[] args) {
	
		Customer c=new Customer();
		c.setId(1);
		c.setFullName("Shiva Pratap Shah");
		c.setEmail("shah.shiva@gmail.com");
		c.setPhone("17577061966");

	}

}
