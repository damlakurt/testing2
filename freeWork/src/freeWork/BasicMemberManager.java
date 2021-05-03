package freeWork;

public class BasicMemberManager extends MemberManager{
	public void add(BasicMember basicMember) {
		System.out.println(basicMember.getBasicId()+" " + basicMember.getFirstName()+" " + basicMember.getLastName()+" " + "Adlý Basic Kullanýcý Sisteme Kayýt Edildi");
	}
	public void delete(BasicMember basicMember) {
		System.out.println(basicMember.getBasicId()+" " + basicMember.getFirstName()+" " + basicMember.getLastName()+" " + "Adlý Basic Kullanýcý Sistemden Silindi");
	}

}
