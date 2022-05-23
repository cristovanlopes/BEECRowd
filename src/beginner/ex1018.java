package beginner;
import java.io.IOException;
import java.util.Scanner;

public class ex1018 {

    public static void main(String[] args) throws IOException {
 Scanner sc = new Scanner(System.in);
		int n, cem, cinq, vint, dez, cinco, dois, um, n1;
	    n = sc.nextInt();
	    n1=n;
	    cem=n/100;n=n-cem*100;
	    cinq=n/50;n=n-cinq*50;
	    vint=n/20; n=n-vint*20;
	    dez=n/10; n=n-dez*10;
	    cinco=n/5;n=n-cinco*5;
	    dois=n/2;n=n-dois*2;
	    um=n/1;
	    System.out.println(n1);
	    System.out.println(cem + " nota(s) de R$ 100,00");
	    System.out.println(cinq + " nota(s) de R$ 50,00");
	    System.out.println(vint + " nota(s) de R$ 20,00");
	    System.out.println(dez + " nota(s) de R$ 10,00");
	    System.out.println(cinco + " nota(s) de R$ 5,00");
	    System.out.println(dois + " nota(s) de R$ 2,00");
	    System.out.println(um + " nota(s) de R$ 1,00");

	    sc.close();
    }

}
