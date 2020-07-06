package fr.afpa.cda;

public class Application {

	public static void main(String[] args) {
		
		Salarie sal = new Salarie();
		
		// j'affecte des valeurs aux attributs de notre objet sal
		sal.m_nMatricule = 1;
		sal.m_nCategorie = 2;
		sal.m_nService = 6;
		sal.m_strNom = "Anouchka MINKOUE OBAME";
		sal.m_dSalaire = 2000;
		
		//Afficher le sal
		//System.out.println(sal.m_nMatricule);
		//System.out.println(sal.m_nCategorie);
		//System.out.println(sal.m_nService);
		//System.out.println(sal.m_strNom);
		
		System.out.println(sal.calculSalaire());

	}

}
