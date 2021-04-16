package Exercicio;

public class TesteAnimal {

	public static void main(String[] args) {
		AnimalCachorro cachorro = new AnimalCachorro();
		AnimalCavalo cavalo = new AnimalCavalo();
		AnimalPreguica preguica = new AnimalPreguica();
		
		Animal animal = null;
		int num = (int) (Math.random()*3.0);
		
		System.out.println("\nO animal escolhido foi Nº: "+num);
		
		switch(num)
		{
		case 0: animal = cachorro;break;
		case 1: animal = cavalo;break;
		case 2: animal = preguica;break;
	
		default: System.out.println("\nErro inesperado ...");
		}
		if(animal!=null)
		{
			animal.emite("- Emite o som:");
			animal.chama(3);
		}
	}
}
	
	
