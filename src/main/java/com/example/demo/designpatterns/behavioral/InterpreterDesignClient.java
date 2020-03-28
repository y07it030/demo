package com.example.demo.designpatterns.behavioral;

//model
abstract class Expression {
	public abstract int getBinaryFormat(int i);

	public abstract int getHexaDecimalFormat(int i);
}

class ConvertToBinary extends Expression {
	public int i;

	@Override
	public int getBinaryFormat(int i) {
		String str = Integer.toBinaryString(i);
		int k = Integer.parseInt(str);
		System.out.println("The converted binary format is" + k);
		return k;
	}

	@Override
	public int getHexaDecimalFormat(int i) {
		String str = Integer.toHexString(i);
		int k = Integer.parseInt(str);
		System.out.println("The converted HexaDecimal format is" + k);
		return k;
	}

}

//Factory class
class Interpreter {
	public static void getConvertedFormat(String requiredFormatType, int i) {
		if (requiredFormatType.equals("Binary"))
			new ConvertToBinary().getBinaryFormat(i);
		if (requiredFormatType.equals("HexaDecimal"))
			new ConvertToBinary().getHexaDecimalFormat(i);
	}
}

public class InterpreterDesignClient {

	public static void main(String[] args) {
		Interpreter.getConvertedFormat("Binary",40);
		Interpreter.getConvertedFormat("HexaDecimal",55);
	}

}
