package Exercicio;

public class AnimalPreguica  extends Animal{
public AnimalPreguica()
	{
		super("Preguica");
	}
        @Override
	public void chama(int num)
	{
	    for(int i=0;i<num;i++)
	{
	
	System.out.println("Uah ah a, a a Uah ah a, ai que preguiça!");
	}
}
	@Override
	public void emite(String som)
	{

			System.out.println("\nEste animal deve subir em árvores...  "+som);
		}
	}	
	
