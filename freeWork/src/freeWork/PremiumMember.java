package freeWork;

public class PremiumMember extends Member {
	
	private int premiumId;
	String companyName;
	String privileges;
	
	public PremiumMember() {
		
	}

	public PremiumMember(int premiumId, String companyName, String privileges) {
		super();
		this.premiumId = premiumId;
		this.companyName = companyName;
		this.privileges = privileges;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPrivileges() {
		return privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}

	public int getPremiumId() {
		return premiumId;
	}
	
	

}
