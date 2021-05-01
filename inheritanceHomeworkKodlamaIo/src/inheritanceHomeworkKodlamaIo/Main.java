package inheritanceHomeworkKodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		UserStudent userStudent1 = new UserStudent();
		userStudent1.setUserName("furkn_smsk");
		userStudent1.setPhoneNumber("05444444444");
		
		UserInstructor userInstructor1 = new UserInstructor();
		userInstructor1.setUserName("engin_dmrg");
		userInstructor1.setPhoneNumber("05333333333");
		
		
		AddUserManager addUserManager = new AddUserManager();
		GetInfo getInfo = new GetInfo();
		
		
		addUserManager.add(new UserInstructorManager());
		System.out.println("Bilgileriniz:");
		getInfo.getinfo(userInstructor1);
		
		System.out.println("---------------------------------------");
		
		addUserManager.add(new UserStudentManager());
		System.out.println("Bilgileriniz:");
		getInfo.getinfo(userStudent1);
		
		
		
		
	}

}
