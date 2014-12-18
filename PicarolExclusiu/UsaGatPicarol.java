public class UsaGatPicarol {
    public static void main(String[] args) {
        Picarol p = new Picarol("ding");
        Gat renat = new Gat("Renat");
        Gat misifu = new Gat("Misifú");
        System.out.println("Tenim els gats:");
        System.out.println("\t" + renat);
        System.out.println("\t" + misifu);
        renat.moute();
        misifu.moute();

        renat.posaPicarol(p);
        misifu.posaPicarol(p); // No es queda amb el picarol
        System.out.println("Ara els gats:");
        System.out.println("\t" + renat);
        System.out.println("\t" + misifu);
        renat.moute();
        misifu.moute();


        Picarol q = renat.treuPicarol();
        misifu.posaPicarol(q); // també p! Ara sí
        System.out.println("Finalment els gats:");
        System.out.println("\t" + renat);
        System.out.println("\t" + misifu);

    }
}
