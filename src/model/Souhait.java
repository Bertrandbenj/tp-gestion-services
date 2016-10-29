package model;

import java.time.LocalDateTime;

/**
 * Fait qu’un enseignant effectue une demande d’un certain type concernant les
 * interventions qu’il souhaite réaliser pour remplir son contrat de service. Ce
 * souhait peut être : • un vœu; • une demande d’intervention extérieure (dans
 * une autre école, une entreprise...) d’un volume horaire donné ; • une demande
 * spéciale (congé, arrêt maladie, encadrement d’un stage ou d’un TER...) d’un
 * volume horaire donné. Un souhait peut être à l’origine d’une intervention
 * affectée (déterminée) par le chef de département (ou plusieurs dans le cas
 * d’un vœu).
 * 
 * @author ben
 *
 */
public abstract class Souhait {

	private boolean publie;

	private LocalDateTime hour;

	public Souhait(boolean publie, LocalDateTime hour) {
		super();
		this.publie = publie;
		this.hour = hour;
	}

	public boolean isPublie() {
		return publie;
	}

	public void setPublie(boolean publie) {
		this.publie = publie;
	}

	public LocalDateTime getHour() {
		return hour;
	}

	public void setHour(LocalDateTime hour) {
		this.hour = hour;
	}

}
