package xMicroService.xEmailMicroService.utils;

public class EmailUtils {

	// static methods for building/manipulating string message that we'll send in mail to the user
	public static String getEmailMessage(String name, String host, String token) {
		return "Hello " + name +",\n\nYour new account has been created. Please click the link below to verify your account.\n\n" 
				+ getVerificationUrl(host, token) + "\n\n The Support Team";
	}

	public static String getVerificationUrl(String host, String token) {
		// concatenate the host here
		return host + "/api/users?token=" + token;
	}
	
	
	// Write Access Request methods messages
	public static String getWriteAccessMessage(String devName, String senderName, String senderPhoneNumber,
												String accessEmail ,String host, String token) {
		
		return "Yoo! " + devName +",\n\nSomeone is requesting a write access on BlogHub.\n"
				+ "Following are their details:\n"
				+ "\nName: " + senderName
				+ "\nAccess Email : " + accessEmail
				+ "\nPhone Number: " + senderPhoneNumber
				+ "\n\nClick the link below to confirm their request.\n\n" 
				+ getWriteAccess(host, token) + "\n\n The Support Team";
	}
	
	public static String getWriteAccess(String host, String token) {
		return host + "/api/write-access/confirmation?token=" + token;
	}
	
}
