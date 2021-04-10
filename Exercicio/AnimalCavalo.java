package Exercicio;

public class AnimalCavalo extends Animal{
	private String relinxa;

	public AnimalCavalo()
	{	
		}
		public String getRelinxa() {
			return relinxa;
		}
	   public void setRelinxa() {
		this.relinxa = relinxa;
	   }
	   public String getNome()
	   {
		   return "Nome do animal: "+super.getNome()+" - Som: "+this.getRelinxa();
	   }
}


