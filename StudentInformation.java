package labCode;
import java.util.Scanner;

public class StudentInformation {

		private String firstName;
		private String lastName;
		private String motherName;
		private String fatherName;
		private String registration;
		private String year;
		
		public StudentInformation()
		{
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter FirstName : ");
			this.firstName = in.nextLine();
			
			System.out.print("Enter lastName : ");
			this.lastName = in.nextLine();
			
			System.out.print( "Enter motherName :" );
			this.motherName=in.nextLine();
			
			System.out.print( "Enter fatherName :" );
			this.fatherName=in.nextLine();
			
			System.out.print( "Enter Registration :" );
			this.registration=in.nextLine();
			
			System.out.print( "year :" );
			this.setYear(in.nextLine());
			System.out.println(firstName + " " + lastName + " " );
			System.out.println("FatherName : " + fatherName );
			System.out.println("MotherName : " + motherName );
			System.out.println("reg : " + registration);
			System.out.println("Year : " + year );
			
			
			
			
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}
		
		
}
