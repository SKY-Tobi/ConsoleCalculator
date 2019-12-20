package ch.bbw.ConsoleCalculator;

/**
 * Calculator - kann zwei Zahlen addieren und zwei Zahlen subtrahieren und zwei Zahlen dividieren und kann von einem double seinen Binärzahl berechnen
 * 
 * @author tobias.heierli
 * @version 0.0.4
 */
public class Calculator {
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}
	public int subtraktion(int value1, int value2) {
		return value1 - value2;
	}
	public double division(int value1, int value2) {
		return value1 / value2;
	}
	public String doubleInBinär(double value) {
		return Long.toBinaryString(Double.doubleToRawLongBits(value));
	}
}
