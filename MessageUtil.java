package TestJUnit;

public class MessageUtil {
	/*
	 * This class prints the given message on console.
	 */
	
	
		private String message;
		
		//Constructor
		//@param message to be printed
		public MessageUtil(String message) {
			this.message = message;
		
		}
		//print the message
		public String printMessage () {
			System.out.println(message);
			return message;
			
		}
}
