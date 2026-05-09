import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	  double abacaxi = 8.5;
		double goiaba = 2.0;
		double laranja = 1.3;
			System.out.println("Quantos vc quer? ");
		int quantidade = sc.nextInt();
		
		System.out.println("Qual o codigo do produto? ");
		int numeroProduto = sc.nextInt();
	
		
		if (numeroProduto==1){
		    System.out.println(abacaxi*quantidade);
		}
		else if (numeroProduto==2){
		    System.out.println(quantidade*goiaba);
		    
		}
		else if (numeroProduto==3)
		{
		    System.out.println(quantidade*laranja);
		    
		}
		else 
		{
		    System.out.println("Esse produto não existe");
		   
		}
		
		
	}
}
