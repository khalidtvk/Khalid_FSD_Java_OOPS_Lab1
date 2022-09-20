import java.util.Random;

public class EmployeeCredentials {
	
	
	Employee emp;
	EmployeeCredentials(Employee emp) {
		this.emp =emp;
		
		
	}
	
	
public String GenerateEmail (String dept) 
{
	String Email = emp.getFirstname() + emp.getLastname() +"@" +dept+ ".abc.com" ;
	return Email;
}


public String GeneratePwd () {
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String spChara = "!@#$%^&*()_+-=<>?.";
	String values = capitalLetters+smallLetters+numbers+spChara;
	Random random = new Random ();
	char [] password = new char [8];
	for (int i=0; i<8; i++)
	{
		password[i] = values.charAt(random.nextInt(values.length()));
	}
	String passwordText = String.valueOf(password);
	return passwordText;

}
public void showCredentials(String Emailaddress)
{
	
	System.out.println("Employee email is " +Emailaddress); 
	System.out.println("Employee password is " + GeneratePwd().toString()); 

}

}
