package fr.afpa.cda;

public class Salarie {
	
	//Déclaration de propriétés
	private int m_nMatricule;
	private int m_nCategorie;
	private int m_nService;
	private String m_strNom;
	public int getM_nMatricule() {
		return m_nMatricule;
	}


	public void setMatricule(int m_nMatricule) {
		this.m_nMatricule = m_nMatricule;
	}
    
	public int getMatricule() {
		return m_nMatricule;
	}

	public int getCategorie() {
		return m_nCategorie;
	}


	public void setCategorie(int m_nCategorie) {
		this.m_nCategorie = m_nCategorie;
	}


	public int getService() {
		return m_nService;
	}


	public void setService(int m_nService) {
		this.m_nService = m_nService;
	}


	public String getNom() {
		return m_strNom;
	}


	public void setNom(String m_strNom) {
		this.m_strNom = m_strNom;
	}


	public double getSalaire() {
		return m_dSalaire;
	}


	public void setSalaire(double m_dSalaire) {
		this.m_dSalaire = m_dSalaire;
	}


	private double m_dSalaire;
	
	
	//Cette fonction calculSalaire retourne une chaine de caractères
	public String calculSalaire() {
		
		return "Le salaire de "+ m_strNom + " est de " + m_dSalaire +".";
	}
}
