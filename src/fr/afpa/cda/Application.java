package fr.afpa.cda;

public class Application {

	public static void main(String[] args) {
		
		Salarie sal1 = new Salarie();
		System.out.println("Le nombre de salarié créé est : "+ Salarie.getCount());
		
		Salarie sal2 = new Salarie(2, 5, 9, "Anne LECLERC", 2000 );
		System.out.println("Le nombre de salarié créé est : "+ Salarie.getCount());
		
		Commercial sal4 = new Commercial(2, 5, 9, "Laurent DUMARC", 2000, 25000, 10 );
		System.out.println("Le nombre de salarié créé est : "+ Salarie.getCount());
		
		// j'affecte des valeurs aux attributs de notre objet sal
		//sal.setMatricule(2);
		//sal.setCategorie(9);
		//sal.setService(12);
		//sal.setNom("Anouchka MINKOUE OBAME");
		//sal.setSalaire(50000);
		
		//Afficher le sal
		//System.out.println(sal.getMatricule());
		//System.out.println(sal.getCategorie());
		//System.out.println(sal.getService());
		//System.out.println(sal.getNom());
		
		//Utilisation de la méthode equals
		Salarie sal3 = sal2;
		
		if(sal2.equals(sal3)) {
			
			System.out.println("Ils sont identiques");
		}
		
		
		System.out.println(sal1.calculSalaire());
		
		System.out.println(sal2.calculSalaire());
		
		System.out.println(sal4.calculSalaire());

	}

}
