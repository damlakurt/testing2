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
		
		
		System.out.println("-Kullanýcýya Ait Diger Bilgiler- " +"\n" + "MailAdresi:" +" "+ member.geteMail()+"\n "+ "TelefonNo:" + " " +member.telNumber);
		
		memberManager.delete(member);
		
		PremiumMember premiumMember = new PremiumMember();
		premiumMember.getPremiumId();
		premiumMember.setFirstName("Hakan");
		premiumMember.setLastName("Karaoðlu");
		premiumMember.seteMail("hakankaraoglu@mail");
		premiumMember.setTelNumber(55544433);
		premiumMember.setCompanyName("Karaoglu Holding");
		premiumMember.setPrivileges("Kotasýz Ve Aþýmsýz Ýnternet" + " +" +" " + "Yüksek Hýzda Ýnternet");
		
		PremiumMemberManager premiumMemberManager = new PremiumMemberManager();
		premiumMemberManager.add(premiumMember);
		
		System.out.println("Kullanýcýya Ait Diger Bilgiler- " +"\n" + "MailAdresi:" +" " + premiumMember.geteMail()+ "\n" + " "+"TelefonNo"+ 
		premiumMember.getTelNumber() + "\n "+ "Þirket Adý :" + " "+ premiumMember.getCompanyName()+  " \n"+"Ayrýcalýklar :" +" "+ premiumMember.getPrivileges() );
		
	
		premiumMemberManager.delete(premiumMember);
		
		
		BasicMember basicMember = new BasicMember();
		basicMember.getBasicId();
		basicMember.seteMail("merihdemir@mail");
		basicMember.setFirstName("Merih");
		basicMember.setLastName("Demir");
		basicMember.setTelNumber(5558833);
		
		BasicMemberManager basicMemberManager = new BasicMemberManager();
		basicMemberManager.add(basicMember);
		
		System.out.println("-Kullanýcýya Ait Diðer Bilgiler-" +"\n"+"Mail Adresi: " + " "+  basicMember.geteMail() + "\n " +"TelefonNo :" + basicMember.getTelNumber());
		
		basicMemberManager.delete(basicMember);
		
	

	}

}
