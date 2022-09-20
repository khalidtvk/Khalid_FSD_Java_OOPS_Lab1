import java.util.Scanner;

public class Employee {

	String firstname;
	String lastname;
	
	public Employee ( String firstname, String lastname)
	{
		this.firstname = firstname;
		this.lastname = lastname;
			
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public static void main(String[] args) {
		Employee NewEmp= new Employee("Khalid", "TV");
	
		EmployeeCredentials NewEmpcred= new EmployeeCredentials (NewEmp);
		
	
		System.out.println("Enter the Department, 1:Technical, 2:Admin,3:Human Resource, 4:Legal");
		Scanner sc = new Scanner (System.in);
		int key = sc.nextInt();
		String EmailAddress;
		switch (key) {
		case 1:
			EmailAddress= NewEmpcred.GenerateEmail("Technical" );
			NewEmpcred.showCredentials(EmailAddress);
			break;
		case 2:
			EmailAddress =NewEmpcred.GenerateEmail( "Admin" );
			NewEmpcred.showCredentials(EmailAddress);
			break;
		case 3:
			EmailAddress =NewEmpcred.GenerateEmail("Human_Resource" );
			NewEmpcred.showCredentials(EmailAddress);
			break;
		case 4:
			EmailAddress =NewEmpcred.GenerateEmail( "Legal" );
			NewEmpcred.showCredentials(EmailAddress);
			break;						
	}
	
}
}
