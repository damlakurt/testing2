package freeWork;

public class BasicMemberManager extends MemberManager{
	public void add(BasicMember basicMember) {
		System.out.println(basicMember.getBasicId()+" " + basicMember.getFirstName()+" " + basicMember.getLastName()+" " + "Adl� Basic Kullan�c� Sisteme Kay�t Edildi");
	}
	public void delete(BasicMember basicMember) {
		System.out.println(basicMember.getBasicId()+" " + basicMember.getFirstName()+" " + basicMember.getLastName()+" " + "Adl� Basic Kullan�c� Sistemden Silindi");
	}

}
