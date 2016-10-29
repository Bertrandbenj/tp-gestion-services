package model;

import java.util.Set;

/**
 * Entité administrative (d’une université) identifiée par un nom. Il comprend
 * un ensemble de modules et d’enseignants qui lui sont rattachés. Chaque
 * département a pour responsable un chef de département. Plusieurs enseignants
 * peuvent donner des enseignements pour le compte de chaque département.
 * 
 * @author ben
 *
 */
public class Departement {

	private Set<Enseignant> enseignants;
	
	private Set<Parcour> parcours;

	private String nom;

	public Departement(String name) {
		nom = name;
	}

	public Set<Enseignant> getEnseignants() {
		return enseignants;
	}

	public String getNom() {
		return nom;
	}

	public void setEnseignants(Set<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Parcour> getParcours() {
		return parcours;
	}

	public void setParcours(Set<Parcour> parcours) {
		this.parcours = parcours;
	}

}
