package beginner;

import java.util.Scanner;

public class ex1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//noteBanks
		int hundredNoteBank, fiftyNoteBank, twentyNoteBank, tenNoteBank, fiveNoteBank, twoNoteBank, oneNoteBank;
		//Coins
		int fiftyCoin, twentyFiveCoin, tenCoin, fiveCoin, oneCentCoin;
		double n = sc.nextDouble();
		double valor_decimal = n - (int)(n);
		valor_decimal = valor_decimal *100;
		int noteBank = (int)n;
		int coins = (int)valor_decimal;
		

	    hundredNoteBank=noteBank/100;noteBank=noteBank-hundredNoteBank*100;    
	    fiftyNoteBank=noteBank/50;noteBank=noteBank-fiftyNoteBank*50;    
	    twentyNoteBank=noteBank/20; noteBank=noteBank-twentyNoteBank*20;
	    tenNoteBank=noteBank/10; noteBank=noteBank-tenNoteBank*10;
	    fiveNoteBank=noteBank/5;noteBank=noteBank-fiveNoteBank*5;
	    twoNoteBank=noteBank/2;noteBank=noteBank-twoNoteBank*2;
	    oneNoteBank=noteBank/1;

		System.out.println("NOTAS:");
	    System.out.println(hundredNoteBank + " nota(s) de R$ 100,00");
	    System.out.println(fiftyNoteBank + " nota(s) de R$ 50,00");
	    System.out.println(twentyNoteBank + " nota(s) de R$ 20,00");
	    System.out.println(tenNoteBank + " nota(s) de R$ 10,00");
	    System.out.println(fiveNoteBank + " nota(s) de R$ 5,00");
	    System.out.println(twoNoteBank + " nota(s) de R$ 2,00");
	    
	    System.out.println("MOEDAS");
	    System.out.println(oneNoteBank + " moeda(s) de R$ 1,00");
		
	    System.out.println(fiftyCoin + " moeda(s) de R$ 0,50");
	    System.out.println(twentyFiveCoin + " moeda(s) de R$ 0,25");
	    System.out.println(tenCoin + " moeda(s) de R$ 0,10");
	    System.out.println(fiveCoin + " moeda(s) de R$ 0,05");
	    System.out.println(oneCentCoin + " moeda(s) de R$ 0,01");
		
		System.out.println("Teste " + coins);
		sc.close();
	}

}
