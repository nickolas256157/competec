import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int lin = 2;
	    int col = 3;
	int[][] tabela = new int[lin][col];
	tabela[0][0]= 9;
	tabela[0][1]= 7;
	tabela[0][2]= 3;
	tabela[1][0]= 7;
	tabela[1][1]= 2;
	tabela[1][2]= 8;
	
	int soma = (tabela[0][1] + tabela[0][0] + tabela[0][2])/3;
	System.out.println("aluno 1: " + soma + " " + "aluno 2: " + (tabela[1][0] + tabela[1][1] + tabela[1][2])/3);
	
	//imprimindo notas
	for( int i = 0; i<lin; i++)
	{
	    for(int j = 0; j<col; j++)
	    {
	      System.out.print(tabela[i][j]);  
	        
	    }
	    System.out.print(" "); 
	  }
	}
	
}