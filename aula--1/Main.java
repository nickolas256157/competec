import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String as = sc.nextLine();
    int numero = as.length();
    System.out.println("olá " + as + ", seu nome tem " + numero + " caracteres");
    System.out.println("o");
    System.out.println(as.charAt(1));
    if (as.equals("nickolas"))
    {
        System.out.println("parabén, você acertou!");
    }
    else
    {
        System.out.println("Que pena, você errou!");
    }
   String[] sobrenome = as.split(" ");
   System.out.println(sobrenome[0]);
   
    
    
  }
}