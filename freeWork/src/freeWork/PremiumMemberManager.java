package freeWork;

public class PremiumMemberManager {
	public void add(PremiumMember premiumMember) {
		System.out.println(premiumMember.getPremiumId()+" " +  premiumMember.getFirstName()+" " + premiumMember.getLastName() +" "+ "Adl� Premium Kullan�c� Sisteme Kay�t Edildi");
	}
	
	public void delete(PremiumMember premiumMember) {
		System.out.println(premiumMember.getPremiumId()+" " +  premiumMember.getFirstName()+" " + premiumMember.getLastName() +" "+ "Adl� Premium Kullan�c� Sistemden Silindi");
	}

}
