package com.arun.abstractfactory;

class TestDesignPatterns {
	public static void main(String [] args){
		testAbstractFactory();
	}
	
	/**
	 * 1. ComputerAbstractFactory is an interface and has a method createComputer() returns Computer.
	 * 2. Computer.java is an abstract class which is extended by PC and Server
	 * 3. ComputerFactory is a factory to create a computer. 
	 * 		Provides a static method getComputer(ComputerAbstractFactory afact), returns afact.createComputer()
	 * 4. PC and Server have their factories PCFactory/ServerFactory. Both implement ComputerAbstractFactory.
	 * 5. PCFactory gives implementation of createComputer() and returns new PC.
	 *  
	 */
	private static void testAbstractFactory(){
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "250 GB", "1.7 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("8 GB", "1 TB", "3.3 GHz"));
		System.out.println(pc);
		System.out.println(server);
	}
}
