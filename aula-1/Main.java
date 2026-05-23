import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while(true){
    	    String senha = sc.nextLine();
    	   
    	    if(senha.equals("claudio"))
    	    {
    	        System.out.println("aceso permitido");
    	        break;
    	    }
    	    else
    	    {
    	        System.out.println("senha Inválida");
    	        continue;
    	    }
	    }
}
}
