package emailVarifier;

import java.util.Scanner;

public class Email {
	String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

	// Taking Email Array Input From console
	public String[] inputListOfEmail() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int length = scan.nextInt();
		if (length > 0) {
			String[] emails = new String[length];
			System.out.println("Enter email Id of Employees");
			for (int i = 0; i < length; i++) {
				String email = scan.next();
				// Email Validation
				if (email.matches(regex)) {
					emails[i] = email;
				} else {
					System.out.println("Please Enter Valid EmailId ");
					i--;
				}
			}

			return emails;
		}
		return null;
	}

	// Email Parsing
	public void filterEmailIdDomain(String[] emails) {
		int count = 0;
		if (emails != null) {
			for (int i = 0; i < emails.length; i++) {
				if (emails[i].contains("gmail")) {
					System.out.println(emails[i]);
					count++;
				} else if (count == 0) {
					System.out.println("There is No any mailId of gmail Domain");
				}

			}
		}
		if (emails == null) {
			System.out.println("There is No Data available to parse");
		}
	}

}
