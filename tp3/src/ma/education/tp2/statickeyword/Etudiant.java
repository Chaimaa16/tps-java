package ma.education.tp2.statickeyword;

public class Etudiant {
	long id;
	String nom;
	public static int nbEtudaints;
	 
	 public Etudiant (long id, String nom,int nb) {
		 this.id = id;
		 this.nom = nom;
		 nbEtudaints+= nb;
		 
		 
	 }
	


}
