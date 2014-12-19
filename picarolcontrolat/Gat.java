//************************************************************
//* DEV: Ferran de San Martin
//* DATE: nov - 2014
//* LANG: Java
//* CONT: Herencia ex1. Classe Gat 
//************************************************************

public class Gat{
	private int vides = (7);
	private String nom = null;
	private GatEstat estat = GatEstat.ASSEGUT;
	private boolean parla = true; 
	private Picarol picarol;
	public UllDeGat ullDret = new UllDeGat();
	public UllDeGat ullEsquerre = new UllDeGat();

//************************************************************
//* Constructors
//************************************************************	
	public Gat(String nom){
		
	}
		
	//un q parla defecte
	public Gat(String nom, boolean parla){
		this(nom);
		setParlar(parla);
	}	 

//************************************************************
//* ESpecificacions exercici 1 Relacions entre Classes
//************************************************************	
//cert si té un picarol assignat. Inicialment no en té.
    boolean tePicarol(){
		return(this.picarol != null);
	}
//assigna un picarol. Si en tenia un, el substitueix pel nou    
    void posaPicarol(Picarol picarol){  //Cal passar parametres??
		if(tePicarol()){
			System.out.println("Ja porto picarol!");
		}else{	
			this.picarol = picarol;		
			System.out.println("Em poso el picarol!");
		}
		
	} 
//retorna el picarol i l'elimina. Si no en tenia cap, retorna null.
    Picarol treuPicarol(){ //Aquest metode peta, si primer picarol=null--> return null, si primer return null --> picarol=null no arriva a fer-se
		if(tePicarol()){
			System.out.println("Em trec el picarol!");	
			Picarol tmp = this.picarol;
			this.picarol = null;
			return tmp;
		}else{
			System.out.println("No porto picarol!");
			return null;
		}
	}
//fa clinc clinc cuan té picarol
	public void SyOuPrLnPicarol(){
		if (tePicarol()){
			this.picarol.sona();			
		}
		else{
			System.out.println("[picarol] ..... .. . . . .   .    .");			
		}
	}
	
//obre ull
	/*public void obreUll(UllDeGat ull){
		
	}
*/
//************************************************************
//* Get i Set de vides.
//************************************************************	
	public int getVides(){
		return vides;
	}
	public void setVides(int vides){
		if (vides>0){
			this.vides=vides;
			SyOuPrLN("Al gat Renat li queden " + this.vides + " vides");
		}	
		else{
			if (vides == 0) {
				this.vides = vides; 
				SyOuPrLN("El gat Renat l'ha dinyat"); 
			}
		}
	}
//************************************************************
//* Aqui afegim els nou setEstat que treballa amb el ENUM i 
//* retorna String o GatEstat
//************************************************************	


	public String getEstatComString(){
		return estat.toString();
	}
	
	public GatEstat getEstat(){
		return estat;
	}
	
	public void setEstat(String estat){
		if (estat.equals(getEstatComString())){
			SyOuPrLN("El gat Renat ja està " + estat + "!");
		}else{			
			if (estat.equals("assegut")){
				this.estat = GatEstat.ASSEGUT;
					SyOuPrLN("El gat Renat es posa " + estat + "!");
					SyOuPrLnPicarol();
					ullDret.obert();
					ullEsquerre.tancat();
			}
			else if (estat.equals("dret")){
				this.estat = GatEstat.DRET;
					SyOuPrLN("El gat Renat es posa " + estat + "!");
					SyOuPrLnPicarol();
					ullDret.obert();
					ullEsquerre.obert();
			}
			else if (estat.equals("estirat")){
				this.estat = GatEstat.ESTIRAT;
					SyOuPrLN("El gat Renat es posa " + estat + "!");
					SyOuPrLnPicarol();
					ullDret.tancat();
					ullEsquerre.tancat();
			}else{
					SyOuPrLN("L'estat que has demanat no el fa el Renat");
			}
		}
	}
	public void setEstat(GatEstat estat){
		if (estat.equals(getEstat())){
			SyOuPrLN("El gat Renat ja està " + estat + "!");
		}else{			
			if (estat.equals(GatEstat.ASSEGUT)){
				this.estat = GatEstat.ASSEGUT;
					SyOuPrLN("El gat Renat es posa " + estat + "!");
					SyOuPrLnPicarol();
					ullDret.obert();
					ullEsquerre.tancat();
			}
			else if (estat.equals(GatEstat.DRET)){
				this.estat = GatEstat.DRET;
					SyOuPrLN("El gat Renat es posa " + estat + "!");
					SyOuPrLnPicarol();
					ullDret.obert();
					ullEsquerre.obert();
			}
			else if (estat.equals(GatEstat.ESTIRAT)){
				this.estat = GatEstat.ESTIRAT;
					SyOuPrLN("El gat Renat es posa " + estat + "!");
					SyOuPrLnPicarol();
					ullDret.tancat();
					ullEsquerre.tancat();
			}else{
					SyOuPrLN("L'estat que has demanat no el fa el Renat");
					SyOuPrLnPicarol();
			}
		}
	}
	
//************************************************************
//* Modifiquem les ordres anteriors per a que funcionin
//* amb estat tipus GatEstat.
//************************************************************
	public boolean estaViu(){
		return vides > 0;		
	}
	public boolean estaDret(){
		return (estat == GatEstat.DRET);		
	}
	public boolean estaAssegut(){
		return (estat == GatEstat.ASSEGUT);		
	}
	public boolean estaEstirat(){
		return (estat == GatEstat.ESTIRAT);		
	}
	public void aixecat(){
		if (!estaDret()){
			estat = GatEstat.DRET;
			SyOuPrLN("M'aixeco!");
			SyOuPrLnPicarol();
			ullDret.obert();
			ullEsquerre.obert();
		}else{
		SyOuPrLN("No em moc!");
		}
	}
	public void seu(){
		if (!estaAssegut()){
			estat = GatEstat.ASSEGUT;
			SyOuPrLN("M'assec!");
			SyOuPrLnPicarol();
			ullDret.obert();
			ullEsquerre.tancat();
		}else{
		SyOuPrLN("No em moc!");
		}
	}
	public void estirat(){
		if (!estaEstirat()){
			estat = GatEstat.ESTIRAT;
			SyOuPrLN("M'estiro!");
			SyOuPrLnPicarol();
			ullEsquerre.tancat();
			ullDret.tancat();
		}else{
		SyOuPrLN("No em moc!");
		}
	}
//************************************************************
//* ESpecificacions exercici 11 GatRenat donem ordres al Gat
//************************************************************	
	public void setParlar(boolean parla){
		this.parla=parla;
	}	
		
	public void calla(){
		System.out.println("Callo!");
		setParlar(false);
	}
	
	public void parla(){
		System.out.println("Parlo!");
		setParlar(true);
	}
	
	public boolean potParlar(){
		return parla;
	}
	
	public void miola(){
		if(potParlar()){ 
			SyOuPrLN("Miaaaaauuuuuuuu!");
		}
		else{
			SyOuPrLN(" .... . .. ... .");
		}
	}
	
	public void SyOuPrLN(String text){
		if (parla){
			System.out.println (text);//(text.substring(1, text.length()-1));			
		}
		else{
			System.out.println(" ..... .. . . . .   .    .");			
		}
	}

}

