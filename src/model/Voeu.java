package model;

import java.time.LocalDateTime;

/**
 * Choix fait par un enseignant, pour un département donné, indiquant quels
 * enseignements il dé- sire dispenser ainsi que ses préférences concernant ces
 * enseignements. Les préférences pour un enseignement sont déterminées de la
 * manière suivante : • 1 : si cet enseignement est réellement souhaité par
 * l’enseignant; • 0 : si cet enseignement est toléré par l’enseignant. Un vœu
 * pourra, après validation par le chef de dé- partement, faire l’objet d’une ou
 * plusieurs interventions.
 * 
 * @author ben
 *
 */
public class Voeu extends Souhait {
	
	private Integer preference;

	public Voeu(boolean publie, LocalDateTime hour, Integer pref) {
		super(publie, hour);
		preference=pref;
	}

	public Integer getPreference() {
		return preference;
	}

	public void setPreference(Integer preference) {
		this.preference = preference;
	}

}
