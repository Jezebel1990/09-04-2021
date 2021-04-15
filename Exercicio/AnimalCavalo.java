package Exercicio;

public class AnimalCavalo extends Animal{
public AnimalCavalo()
	   {	
		
		super("Cavalo");
		}
		
		@Override
		public void chama(int num)
		{
		    for(int i=0;i<num;i++)
		{

		System.out.println("hiin in in hinir,hiin in in hinir");
		  }
		}
		@Override
		public void emite(String som)
		{
			if(som.charAt(0)=='9' || som.charAt(0)=='8')
			{
				System.out.println("\nEste animal deve correr...");
		}	
		else
		{
			System.out.println("\nAlipio Luz, tem 10 anos "+som);
		}
	}
 }

