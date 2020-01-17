package ch.bbw.ConsoleCalculator;

/**
 * Calculator - kann zwei Zahlen addieren und zwei Zahlen subtrahieren und zwei Zahlen dividieren und kann von einem double seinen Binärzahl berechnen. Das endkapital vom zinseszins kann auch berechnet werden.
 * 
 * @author tobias.heierli
 * @version 0.0.5
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
	public double zinsesZins(double startkapital, double zinssatz, double jahre) {
		return (double) Math.round(startkapital * Math.pow(1 + zinssatz / 100, jahre) * 100) / 100;
	}
}
