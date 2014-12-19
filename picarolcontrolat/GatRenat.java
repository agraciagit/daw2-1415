//************************************************************
//* DEV: Ferran de San Martin
//* DATE: nov - 2014
//* LANG: Java
//* CONT: Relacions entre classes ex2. Classe GatRenat
//*			subclasse de Gat
//************************************************************

public class GatRenat extends Gat{
	

//************************************************************
//* Constructors
//************************************************************	
	public GatRenat(){
		
	}
		
	//un q parla defecte
	public GatRenat(boolean parla){
		this();
		setParlar(parla);
	}	 

}

