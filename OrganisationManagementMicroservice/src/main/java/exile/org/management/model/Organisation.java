package exile.org.management.model;

import java.util.UUID;

public class Organisation {

	UUID organisationId;
	
	String organisationName;
	
	String Country;
	
	int managerId;

	public UUID getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(UUID organisationId) {
		this.organisationId = organisationId;
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	
}
