
public class StringCalculator {
	   public static int add(final String numbers) {
		      int returnValue = 0;
		      String[] numbersArray = numbers.split(",|\n"); 
		      for (String number : numbersArray) {
		         if (!number.trim().isEmpty()) {
		        	 int holder = Integer.parseInt(number.trim());
		        	 if(holder < 0) {
		        		 throw new IllegalArgumentException();
		        	 } else if (holder > 1000) {
		        		 holder = 0;
		        	 }
		            returnValue += Integer.parseInt(number.trim());
		         }
		      }
		      return returnValue;
		   }
}
