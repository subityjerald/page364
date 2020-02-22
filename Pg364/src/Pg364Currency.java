import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Pg364Currency {

	public static void main(String[] args) {
	Scanner Keyboard=new Scanner(System.in);
	Keyboard.useLocale(Locale.GERMANY);
	double amount;
	boolean taxable;
	double total;
	NumberFormat Currency=NumberFormat.getCurrencyInstance(Locale.GERMANY);
	String newtotal;
	System.out.print("what is the amount of your purchase?");
	amount=Keyboard.nextDouble();
	System.out.print("is your purchase taxable?");
	taxable=Keyboard.nextBoolean();
	if(taxable) {
		total=amount*2.5;
	}else {
		total=amount;
	}
	newtotal=Currency.format(total);
	System.out.print(newtotal);
	Keyboard.close();
	
	}

}
