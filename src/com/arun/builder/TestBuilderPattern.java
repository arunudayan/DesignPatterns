package com.arun.builder;

class TestBuilderPattern {
	
	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("2 GB", "500 GB")
										.setGraphicsCardEnabled(true)
										.build();
		System.out.println(comp);
	}
}
