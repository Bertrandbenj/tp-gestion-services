package model;

import java.time.Duration;
import java.util.Optional;

/**
 * Nombre d’heures minimum (et parfois nombre d’heures maximum) d’enseignements
 * à effectuer pour un enseignant donné. Il est indépendant des départements
 * dans lesquels l’enseignant intervient : il est unique et seulement déterminé
 * par le statut de l’enseignant.
 * 
 * @author ben
 *
 */
public class Contrat {
	private Duration min;
	private Optional<Duration> max;

	
	public Contrat(Duration min, Duration max) {
		super();
		this.min = min;
		this.max = Optional.of(max);
	}
	
	public Contrat(Duration min) {
		super();
		this.min = min;
	}

	public Duration getMin() {
		return min;
	}

	public void setMin(Duration min) {
		this.min = min;
	}

	public Duration getMax() {
		return max.get();
	}

	public void setMax(Duration max) {
		this.max = Optional.of(max);
	}

}
