//************************************************************
//* DEV: Ferran de San Martin
//* DATE: nov - 2014
//* LANG: Java
//* CONT: Relacions entre classes ex1. Classe UsaGatRenat. 
//*			Conté el main.
//************************************************************

public class UsaGatRenat{
    public static void main (String[] args){
        GatRenat renat = new GatRenat(false);
        Picarol picarol = null;
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
                    //renat.ullDret.obert(); //D'on sortirà el picarol??
                    //ullEsquerre.UllDeGat.obert(); 
                    break;
                case "tanca ulls" : 
                    //renat.ullDret.tancat(); //D'on sortirà el picarol??
                    //ullEsquerre.UllDeGat.tancat(); 
                    break;
                case "posa't picarol" :
                    if(tmp==null){
                        System.out.println(picarol);
                        System.out.println(tmp);
                        picarol = new Picarol();
                        System.out.println(picarol);
                        renat.posaPicarol(picarol); 
                        System.out.println(picarol);
                        System.out.println(tmp);
                    }else{
                        System.out.println(picarol);
                        System.out.println(tmp);
                        renat.posaPicarol(tmp);
                        System.out.println(picarol);
                        System.out.println(tmp);
                    }
                    break;
                case "treu-te picarol" : 
                    System.out.println(picarol);
                    System.out.println(tmp);
                    tmp=renat.treuPicarol();
                    System.out.println(picarol);
                    System.out.println(tmp);
                    break;
                case "tens picarol?": 
                    if(renat.tePicarol()){
                        renat.SyOuPrLN("Si");
                        System.out.println(picarol);
                        System.out.println(tmp);
                    }else{
                        renat.SyOuPrLN("No");
                        System.out.println(picarol);
                        System.out.println(tmp);
                    }
                    break;
                case "com estas?" : 
                    renat.SyOuPrLN(renat.getEstatComString());
                    break;
                case "com estàs?" : 
                    renat.SyOuPrLN(renat.getEstatComString());
                    break;
                case "aixeca\'t": 
                    renat.aixecat();
                    break;
                case "seu": 
                    renat.seu();
                    break;
                case "estira\'t" : 
                    renat.estirat();
                    break;
                case "miola" : 
                    renat.miola();
                    break;
                case "calla" : 
                    renat.calla();
                    break;
                case "parla" :
                    renat.parla();
                    break;
                case "adeu": 
                    renat.SyOuPrLN("Apavingavaledéu!!");
                    infinit=false;
                    break;
                default: renat.SyOuPrLN("No he entés que m'has demanat!");
            }
        }




        renat.setEstat(GatEstat.ESTIRAT);
        renat.seu();
        System.out.println(renat.getEstat());

        renat.miola();
        renat.calla();
        renat.miola();
        renat.parla();
        renat.miola();
        renat.calla();

        renat.setEstat(GatEstat.ESTIRAT);
        renat.seu();
        System.out.println("3" + renat.getEstat());


    }
}
