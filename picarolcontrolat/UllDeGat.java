//************************************************************
//* DEV: Ferran de San Martin
//* DATE: nov - 2014
//* LANG: Java
//* CONT: Relacions entre classes ex1. Classe UllDeGat
//*********************************************************

public class UllDeGat{
	private boolean ullEstat = false; //false -->ull tancat
		
	public void obert(){
		if(ullEstat){
			System.out.println("Ja tinc l'ull obert");
		}else{
			System.out.println("nyeek");
		}
		this.ullEstat = true;
		
	}
	public void tancat(){
		if(!ullEstat){
			System.out.println("Ja tinc l'ull tancat");
		}else{
			System.out.println("plonx");
		}
		this.ullEstat = false;
		
	}
	public boolean estasObert(){
		if(ullEstat){
			return true;
		}else{
			return false;
		}
	}

}
