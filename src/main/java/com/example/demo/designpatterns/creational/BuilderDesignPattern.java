package com.example.demo.designpatterns.creational;
//This pattern is used to avoid complex object creation logic and find a simple way to build and return a final object in a step by step procedure.
//This is used to avoid the issues in factory and abstract factory design patterns.
//This is recommended to use nested static class with optional and non optional parameters and then construct the object 
//with inner class making the outer class constructor as private

class Builder
{
	private String ram;
	private String hdd;
	
	private boolean isWirelessEnabled;
	private boolean isBlueToothEnabled;
	
	private Builder(BuilderP p)
	{
		this.ram=p.ram;
		this.hdd=p.hdd;
		this.isWirelessEnabled=p.isWirelessEnabled;
		this.isBlueToothEnabled=p.isBlueToothEnabled;
	}
	
	static class BuilderP
	{
		private String ram;
		private String hdd;
		
		private boolean isWirelessEnabled;
		private boolean isBlueToothEnabled;
		
		public BuilderP(String ram,String hdd)
		{
			this.ram=ram;
			this.hdd=hdd;
			System.out.println(this.ram+this.hdd);
		}
		public BuilderP setIsWirelessEnabled(boolean isWirelessEnabled)
		{
		this.isWirelessEnabled= isWirelessEnabled;
		return this;
		}
		public BuilderP setIsBlueToothEnabled(boolean isBlueToothEnabled)
		{
		this.isBlueToothEnabled= isBlueToothEnabled;
		return this;
		}
		
		public Builder build()
		{
			return new Builder(this);
		}
		
	}
	
	
}

public class BuilderDesignPattern {

	public static void main(String[] args) {
		Builder.BuilderP bp=new Builder.BuilderP("2GB","5GB");
	}
	
	
}
