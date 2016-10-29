package model;

import java.util.Set;

public class Service {

	private Integer volume;
	private Integer annee;
	private Set<Intervention> interventions;
	
	public Service() {
		
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Set<Intervention> getInterventions() {
		return interventions;
	}

	public void setInterventions(Set<Intervention> interventions) {
		this.interventions = interventions;
	}

}
