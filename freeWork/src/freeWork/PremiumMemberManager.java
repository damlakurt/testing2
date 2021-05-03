package freeWork;

public class PremiumMemberManager {
	public void add(PremiumMember premiumMember) {
		System.out.println(premiumMember.getPremiumId()+" " +  premiumMember.getFirstName()+" " + premiumMember.getLastName() +" "+ "Adlý Premium Kullanýcý Sisteme Kayýt Edildi");
	}
	
	public void delete(PremiumMember premiumMember) {
		System.out.println(premiumMember.getPremiumId()+" " +  premiumMember.getFirstName()+" " + premiumMember.getLastName() +" "+ "Adlý Premium Kullanýcý Sistemden Silindi");
	}

}
