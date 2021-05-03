package freeWork;

public class Main {

	public static void main(String[] args) {
		
		
		
		Member member =new Member();
		member.setFirstName("Deniz");
		member.setLastName("Karasu");
		member.seteMail("denizkarasu@mail");
		member.setTelNumber(5552223);
		
		
		
		MemberManager memberManager = new MemberManager();
		memberManager.add(member);
		
		
		System.out.println("-Kullan�c�ya Ait Diger Bilgiler- " +"\n" + "MailAdresi:" +" "+ member.geteMail()+"\n "+ "TelefonNo:" + " " +member.telNumber);
		
		memberManager.delete(member);
		
		PremiumMember premiumMember = new PremiumMember();
		premiumMember.getPremiumId();
		premiumMember.setFirstName("Hakan");
		premiumMember.setLastName("Karao�lu");
		premiumMember.seteMail("hakankaraoglu@mail");
		premiumMember.setTelNumber(55544433);
		premiumMember.setCompanyName("Karaoglu Holding");
		premiumMember.setPrivileges("Kotas�z Ve A��ms�z �nternet" + " +" +" " + "Y�ksek H�zda �nternet");
		
		PremiumMemberManager premiumMemberManager = new PremiumMemberManager();
		premiumMemberManager.add(premiumMember);
		
		System.out.println("Kullan�c�ya Ait Diger Bilgiler- " +"\n" + "MailAdresi:" +" " + premiumMember.geteMail()+ "\n" + " "+"TelefonNo"+ 
		premiumMember.getTelNumber() + "\n "+ "�irket Ad� :" + " "+ premiumMember.getCompanyName()+  " \n"+"Ayr�cal�klar :" +" "+ premiumMember.getPrivileges() );
		
	
		premiumMemberManager.delete(premiumMember);
		
		
		BasicMember basicMember = new BasicMember();
		basicMember.getBasicId();
		basicMember.seteMail("merihdemir@mail");
		basicMember.setFirstName("Merih");
		basicMember.setLastName("Demir");
		basicMember.setTelNumber(5558833);
		
		BasicMemberManager basicMemberManager = new BasicMemberManager();
		basicMemberManager.add(basicMember);
		
		System.out.println("-Kullan�c�ya Ait Di�er Bilgiler-" +"\n"+"Mail Adresi: " + " "+  basicMember.geteMail() + "\n " +"TelefonNo :" + basicMember.getTelNumber());
		
		basicMemberManager.delete(basicMember);
		
	

	}

}
