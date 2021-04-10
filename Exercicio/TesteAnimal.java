package Exercicio;

public class TesteAnimal {

	public static void main(String[] args) 
	{
		AnimalCachorro cachorro = new AnimalCachorro();
		cachorro.setNome("Fuba Silva");
		cachorro.setSom("Au au, au au au.Au au, au au au");
		AnimalCavalo cavalo = new AnimalCavalo();
		cavalo.setNome("Alipio Luz");
		cavalo.setSom("hiin in in hinir,hiin in in hinir");
		AnimalPreguica preguica = new AnimalPreguica();
		preguica.setNome("Soneca de Jesus");
		preguica.setSom("Uah ah a, a a Uah ah a");
		
		Animal[] animal = new Animal[2];
		animal[0]=cachorro;
		animal[1]=cavalo;
		animal[2]=preguica;
		{
		System.out.println(Animal.getNome);
		}
	}
}

	
