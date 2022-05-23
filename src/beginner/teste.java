package beginner;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double valor_decimal = n - (int)(n);
		valor_decimal = valor_decimal *100;
		int value = (int)valor_decimal;
	System.out.println(value + "\n");
	}

}
