package ch.bbw.ConsoleCalculator;

/**
 * Console Calculator App
 * 
 * @author tobias.heierli
 * @version 0.0.4
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;
        
        System.out.println("Console Calculator");
        System.out.println("******************");
        System.out.println();
        
        valueA = 10;
        valueB = 20;
        
        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));
        System.out.println("Subtraktion " + valueB + " - " + valueA + " = " + calculator.subtraktion(valueB, valueA));
        System.out.println("Division " + valueB + " / " + valueA + " = " + calculator.division(valueB, valueA));
        System.out.println("HexZahl: " + valueA + " : " + calculator.doubleInBinär(valueA));
    }
}
