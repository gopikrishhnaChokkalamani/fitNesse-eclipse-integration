package com.gi.fitnesse;

import fit.ColumnFixture;

public class CalculatorFixture extends ColumnFixture {
	public int first;
	public int second;

	public int addition() {
		return first + second;
	}

	public int multiply() {
		return first * second;
	}
}
