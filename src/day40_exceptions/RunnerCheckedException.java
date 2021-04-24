package day40_exceptions;

public class RunnerCheckedException {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
		String email ="rasit@gmail.com";
		
		mailDogrula(email);

	}

	public static void mailDogrula(String email) throws InvalidEmailIdCheckedException {
		
		if (email.contains("@hotmail.com") || email.contains("@gmail.com")) {
			
			System.out.println("Email kaydedildi");
		
		}else {
			throw new  InvalidEmailIdCheckedException("email uygun deðil");
		}
		
	}

}
