package ly.spring.first.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ly.spring.first.dtos.Address;
import ly.spring.first.dtos.Customer;

public class SpringMainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		Customer customer = (Customer) ctx.getBean("cust");
		System.out.println(customer.toString());

		Address ad = (Address) ctx.getBean("address");
		System.out.println(ad.toString());
	}

}
