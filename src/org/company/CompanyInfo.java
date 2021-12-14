package org.company;

public class CompanyInfo {
private void companyName(String name, int id,boolean status, long mobile,float salary) {
	System.out.println("comp name is"+ name +"\n"+ "company Id is "+ id +"\n"+"company current status is"+ status 
			+"\n"+ "company mobile number is "+ mobile +"\n"+"company salary is "+ salary );
	
}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName("name", 1234, true, 123456789l, 8585.284f);
}
}

