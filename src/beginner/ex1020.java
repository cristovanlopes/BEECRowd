package beginner;
import java.util.Scanner;
public class ex1020 {
	public static void main(String[] args) {
		int idade, y, m, d, r;
		Scanner sc = new Scanner(System.in);
		idade = sc.nextInt();
		y=idade/365;
		r=idade%365;
		m=r/30;
		r=r%30;
		d=r;
		System.out.println(y + " ano(s)");
		System.out.println(m + " mes(es)");
		System.out.println(d + " dia(s)");
		sc.close();
	}

}
