package fr.afpa.cda;

public class Application {

	public static void main(String[] args) {
		
		Salarie sal = new Salarie();
		
		// j'affecte des valeurs aux attributs de notre objet sal
		sal.setMatricule(2);
		sal.setCategorie(9);
		sal.setService(12);
		sal.setNom("Anouchka MINKOUE OBAME");
		sal.setSalaire(50000);
		
		//Afficher le sal
		//System.out.println(sal.getMatricule());
		//System.out.println(sal.getCategorie());
		//System.out.println(sal.getService());
		//System.out.println(sal.getNom());
		
		System.out.println(sal.calculSalaire());

	}

}
