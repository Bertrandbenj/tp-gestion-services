package model;

public class Enseignement {
	
	public enum TypeEnseignement {
	    CM, TD, TP, 
	}
	
	private Integer volume;
	private TypeEnseignement type;

	public Enseignement(Integer vl, TypeEnseignement type) {
		this.setType(type);
		volume=vl;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public TypeEnseignement getType() {
		return type;
	}

	public void setType(TypeEnseignement type) {
		this.type = type;
	}

}
