package ch.bbw.ConsoleCalculator;

import java.util.Arrays;

/**
 * Calculator - kann zwei Zahlen addieren und zwei Zahlen subtrahieren und zwei
 * Zahlen dividieren und kann von einem double seinen Binärzahl berechnen. Das
 * endkapital vom zinseszins kann auch berechnet werden. Es löst auch
 * Quadratische Formeln auf.
 * 
 * @author tobias.heierli
 * @version 0.0.6
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

	public String quadratischeFormel(String formel) {
		String[] components = formel.replace(" ", "").split("[x\\^*]");
		double a = 0;
		double b = 0;
		double c = 0;
		if (components[0].trim().isEmpty()) {
			components = filter(components);
			a = 1;
			b = Double.parseDouble(components[0]);
			c = Double.parseDouble(components[1]);
		} else {
			components = filter(components);
			a = Double.parseDouble(components[0]);
			b = Double.parseDouble(components[1]);
			c = Double.parseDouble(components[2]);
		}
		if(Math.pow(b, 2)- 4*a*c < 0 || a == 0) {
			return "nicht möglich";
		} else if(Math.sqrt(Math.pow(b, 2)- 4*a*c) == 0) {
			return String.valueOf((double) Math.round((b * -1 + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a) * 100) / 100);
		} else {
			return String.valueOf((double) Math.round((b * -1 + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a) * 100) / 100) + ", " + String.valueOf((double) Math.round((b * -1 - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a) * 100) / 100);
		}
	}
	
	public String[] filter(String[] array) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (!array[i].isEmpty()) {
				array[index++] = array[i];
			}
		}
		return Arrays.copyOf(array, index);
	}

}
