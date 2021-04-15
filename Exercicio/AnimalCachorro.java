package Exercicio;

public class AnimalCachorro extends Animal {
	public AnimalCachorro()
	{
	    super("Cachorro");
	}
	@Override
	public void chama(int num)
	{
	    for(int i=0;i<num;i++)
	{
	       System.out.println("Au au, au au au.Au au, au au au");
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
		System.out.println("\nFuba Silva, tem 8 anos "+som);
	}
  }
}
