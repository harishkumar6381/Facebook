package org.phone;

public class Phone {
	private void phoneInfo(String name) {
		System.out.println(name);
	}
	private void phoneInfo(int pincode, String city) {
		System.out.println(pincode+"\t"+city);
		System.out.println(city+"\t"+pincode);
		System.out.println("qwerty");
		System.out.println("1234567");
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo("hari");
		p.phoneInfo(6000001, "chennai");
	}
}
