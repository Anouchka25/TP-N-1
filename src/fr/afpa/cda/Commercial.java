package fr.afpa.cda;

public class Commercial extends Salarie {

	private double m_dChiffreAffaire;
	private int m_pcCommission;
	
	public double getChiffreAffaire() {
		return m_dChiffreAffaire;
	}

	public void setChiffreAffaire(double m_dChiffreAffaire) {
		this.m_dChiffreAffaire = m_dChiffreAffaire;
	}

	public int getCommission() {
		return m_pcCommission;
	}

	public void setCommission(int m_pcCommission) {
		this.m_pcCommission = m_pcCommission;
	}

	public Commercial(int matricule, int categorie, int service, String nom, double salaire, double m_dChiffreAffaire,
			int m_pcCommission) {
		super(matricule, categorie, service, nom, salaire);  //Ici je fais appel au constructeur de la class parent Salarie
		this.m_dChiffreAffaire = m_dChiffreAffaire;
		this.m_pcCommission = m_pcCommission;
	}

	//Constructeur par défaut
	public Commercial() {
		super();
	}
	
	//Surcharge 
    public String calculSalaire() {
		
		return "Le salaire de "+ getNom() + " est de " + getSalaire() + m_dChiffreAffaire * m_pcCommission /100 + ".";
	}
	
	
}
