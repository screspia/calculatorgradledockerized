package com.privalia.business;

public class Calculator implements ICalculator, Runnable {

	@Override
	public void run() {
		
	}

	@Override
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}

}
