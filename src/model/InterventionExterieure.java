package model;

public class InterventionExterieure extends Intervention {

	private String organisation;
	
	public InterventionExterieure(Integer volume, String organisation) {
		super(volume);
		this.setOrganisation(organisation);
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

}
