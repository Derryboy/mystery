package org.company;
import org.client.*;

public class Company extends Client { //Child Class
	private void companyName() {
		// TODO Auto-generated method stub
		System.out.println("Company Name: HCL InfoTech");

	}
	
	public static void main(String[] args) {
		Company c = new Company();
		c.companyName();
		c.clientName();
	}

}
