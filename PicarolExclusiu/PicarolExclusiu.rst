En aquesta versió del picarol, volem que una instància de Picarol
pugui estar en com a màxim un gat.

Ex.

Picarol p = new Picarol();
Gat renat = new Gat("Renat");
Gat misifu = new Gat("Misifú");

renat.posaPicarol(p);
misifu.posaPicarol(p); // ha de donar error

Picarol q = renat.treuPicarol();
misifu.posaPicarol(q); // també p! Ara sí

Versió relaxada: no podrem evitar que dos gats tinguin el mateix
picarol, però sí que el picarol només el pugui fer sonar un gat (el
primer).
