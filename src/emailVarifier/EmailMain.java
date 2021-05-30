package emailVarifier;

public class EmailMain {

	public static void main(String[] args) {
		Email email = new Email();
		String[] inputListOfEmail = email.inputListOfEmail();

		if (inputListOfEmail != null) {
			email.filterEmailIdDomain(inputListOfEmail);
		}
	}

}
