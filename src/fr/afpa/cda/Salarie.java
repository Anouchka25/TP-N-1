package fr.afpa.cda;

public class Salarie {
	
	//D�claration de propri�t�s
	int m_nMatricule;
	int m_nCategorie;
	int m_nService;
	String m_strNom;
	double m_dSalaire;
	
	
	//Cette fonction calculSalaire retourne une chaine de caract�res
	public String calculSalaire() {
		
		return "Le salaire de "+ m_strNom + " est de " + m_dSalaire +".";
	}
}
