//************************************************************
//* DEV: Ferran de San Martin
//* DATE: nov - 2014
//* LANG: Java
//* CONT: Herencies ex1. Classe UsaGat. 
//*			Conté el main.
//************************************************************

public class UsaGat{
	public static void main (String[] args){
		Gat renatJR = new Gat("RenatJR");
		Picarol picarol1 = null;
		Picarol tmp = null;

		String opcio="";
		boolean infinit = true;
		while(infinit){
			System.out.println("***Donem una ordre: obre ulls | tanca ulls");
			System.out.println("***Donem una ordre: posa't picarol | treu-te picarol | tens picarol?");
			System.out.println("***Donem una ordre: com estàs? | aixeca’t | seu | estira’t | miola | calla | parla | adeu ");
			opcio = IOUtils.llegeixStr();
			
			System.out.print("[Renat]:");
			switch (opcio){
				case "obre ulls" :
				//COM CRIDEM AL METODE DE LA CLASSE ULL DE GAT PER A UN OBJECTE TIPUS GAT???????????????
						ullDret.UllDeGat.obert(); //D'on sortirà el picarol??
						ullEsquerre.UllDeGat.obert(); 
						break;
				case "tanca ulls" : 
						renat.ullDret.tancat(); //D'on sortirà el picarol??
						ullEsquerre.UllDeGat.tancat(); 
						break;
				case "posa't picarol" :
						if(tmp==null){
							renatJR.posaPicarol(picarol1);
							picarol1 = null;
						}else{
							renatJR.posaPicarol(tmp);
							tmp = null;
						}
						break;
				case "treu-te picarol" :
						tmp=renatJR.treuPicarol();
						break;
				case "tens picarol?": 
						if(renatJR.tePicarol()){
							renatJR.SyOuPrLN("Si");
						}else{
							renatJR.SyOuPrLN("No");
						}
						break;
				case "com estas?" : 
					renatJR.SyOuPrLN(renatJR.getEstatComString());
					break;
				case "com estàs?" : 
					renatJR.SyOuPrLN(renatJR.getEstatComString());
					break;
				case "aixeca\'t": 
					renatJR.aixecat();
					break;
				case "seu": 
					renatJR.seu();
					break;
				case "estira\'t" : 
					renatJR.estirat();
					break;
				case "miola" : 
					renatJR.miola();
					break;
				case "calla" : 
					renatJR.calla();
					break;
				case "parla" :
					renatJR.parla();
					break;
				case "adeu": 
						renatJR.SyOuPrLN("Apavingavaledéu!!");
						infinit=false;
						break;
				default: renatJR.SyOuPrLN("No he entés que m'has demanat!");
			}
		}

		
		
		
		renatJR.setEstat(GatEstat.ESTIRAT);
		renatJR.seu();
		System.out.println(renatJR.getEstat());
		
		renatJR.miola();
		renatJR.calla();
		renatJR.miola();
		renatJR.parla();
		renatJR.miola();
		renatJR.calla();
		
		renatJR.setEstat(GatEstat.ESTIRAT);
		renatJR.seu();
		System.out.println("3" + renatJR.getEstat());
	
		
	}
}

