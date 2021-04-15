package Exercicio;

public class Animal {   
	private String atrTipo;  
	
	     public Animal(String parTipo)
	     {
	          this.atrTipo = parTipo;
	     }
	    abstract public void emite( String som) ;
	    abstract public void chama(int  num);
	    
	    public String getAtrTipo() {
	    	return atrTipo;
		}
	    public void setAtrTipo(String atrTipo) {
	    	this.atrTipo = atrTipo;
	    }
}
	
	
