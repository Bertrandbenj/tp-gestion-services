package model;

/**
 * Fait qu’un enseignant intervienne dans un département donné. Elle a pour
 * origine, la plupart du temps, un souhait formulé par un enseignant. Cette
 * intervention peut être de différentes natures : • il peut s’agir d’une
 * intervention dans le département, c’est-à-dire qu’un enseignement soit
 * affecté à un enseignant pour un volume horaire donné ; • il peut s’agir d’une
 * intervention extérieure (dans une entreprise, une autre école...), d’un
 * volume horaire donné ; • il peut s’agir d’un cas spécial (congés, maladies,
 * encadrement d’un stage ou d’un TER...), toujours d’un volume horaire donné.
 * 
 * @author ben
 *
 */
public abstract class Intervention {

	private Integer volume;

	public Intervention(Integer volume) {
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

}
