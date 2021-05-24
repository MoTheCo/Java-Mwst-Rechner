import java.util.Scanner;
public class Rechner {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		System.out.println("rechnen sie die mwst für ihr produkt aus");
System.out.println("");
		
		int counter =0;
		while (counter <= 1000000)  {
		System.out.println("");
	System.out.println("geben sie den brutto preis ein");
	
double bp = in.nextInt();
double mwst = 0.19;
double r1 =bp * mwst; 
System.out.println("");
System.out.println(r1 + "€");
System.out.println("");
double r2 =r1 + bp; 
System.out.println("gesamtbetrag inkl mwst ist = " + r2+ " €");

	}

}
