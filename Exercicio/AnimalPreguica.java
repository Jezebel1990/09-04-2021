package Exercicio;

public class AnimalPreguica  extends Animal{

	private String espreguica;
	public AnimalPreguica()
	{
			}
			public String getEspreguica() {
				return getEspreguica();
			}
		   public void setEspreguica() {
			this.espreguica = espreguica;
		   }
		   public String getNome()
		   {
			   return "Nome do animal: "+super.getNome()+" - Som: "+this.getEspreguica();
		   }
	}