import java.util.Scanner;
public class Main
{ 
	public static void main(String[] args) {
	    Scanner scaner = new Scanner(System.in);
		double valorAbacaxi = 7.30;
		double valorMaca = 2.0;
		double valorPera = 3.0;
		
		System.out.println("quantos abacaxi vc comprou? ");
		int quantidaDeAbacaxi = scaner.nextInt();
		System.out.println("quantas maças vc omprou? ");
		int quantidaDeMaca = scaner.nextInt();
		System.out.println("quantas peras vc comprou? ");
		int quantidaDePera = scaner.nextInt();
		double somaAbacaxi = 7.30 * quantidaDeAbacaxi;
		double somaMaca = 2.0 * quantidaDeMaca;
		double somaPera = 3.0 * quantidaDePera;
		double totalAPagar = somaPera+somaMaca+somaAbacaxi;
		System.out.println(totalAPagar);
	}
}
