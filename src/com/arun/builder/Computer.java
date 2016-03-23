package com.arun.builder;

class Computer {

	// Required parameters
	private String ram;
	private String hdd;

	// Optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBlueToothEnabled;

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBlueToothEnabled() {
		return isBlueToothEnabled;
	}
	
	private Computer(ComputerBuilder builder){
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBlueToothEnabled = builder.isBlueToothEnabled;
		
	}
	
	//Builder Class
	static class ComputerBuilder {

		// Required parameters
		private String ram;
		private String hdd;

		// Optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBlueToothEnabled;

		
		public ComputerBuilder(String ram, String hdd){
			this.ram = ram;
			this.hdd = hdd;
		}
		
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder isBlueToothEnabled(boolean isBlueToothEnabled) {
			this.isBlueToothEnabled = isBlueToothEnabled;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
	}
	
	@Override
	public String toString(){
		return "RAM= " + this.ram + " , HDD= " + this.hdd + " , Graphics= " + this.isGraphicsCardEnabled + " , Bluetooth= " + this.isBlueToothEnabled;
	}
}
