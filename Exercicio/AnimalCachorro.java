package Exercicio;

public class AnimalCachorro extends Animal {
	private String late;
	public AnimalCachorro()
	{
		
	}
	public String getLate() {
		return late;
	}
   public void setLate() {
	this.late = late;
   }
   public String getNome()
   {
	   return "Nome do animal: "+super.getNome()+" - Som: "+this.getLate();
   }
}
