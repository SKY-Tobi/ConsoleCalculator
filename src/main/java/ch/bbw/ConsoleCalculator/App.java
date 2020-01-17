package ch.bbw.ConsoleCalculator;

/**
 * Console Calculator App
 * 
 * @author tobias.heierli
 * @version 0.0.6
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
        System.out.println("ZinsesZins Kapital = 1200, Zins = 4%, Jahre = 5: " + calculator.zinsesZins(1200, 4, 5));
        System.out.println("Quadratische Formel x^x - 3x - 40: " + calculator.quadratischeFormel("x^x - 3x - 40"));
    }
}
