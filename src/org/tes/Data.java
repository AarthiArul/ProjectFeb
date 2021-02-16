package org.tes;

public class Data {
	private void printSome()
	{
		System.out.println("Data Print");
		System.out.println("Person-1 changed the code");
		System.out.println("Person 2 Change the code");
	}
	public static void main(String[] args) {
		
		Data d=new Data();
		d.printSome();
	}

}
