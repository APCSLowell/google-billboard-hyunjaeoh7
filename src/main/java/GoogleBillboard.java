

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		System.out.println("Replace this string with your answer!");
	}
	

	//Finish this function
	public boolean isPrime(double num){
		if(num < 2){
    			return false;
  		}
  		if(num != 2 && num % 2 == 0){
    			return false;
  		}
  
  		for(int i = 1; i <= Math.sqrt(num); i+=2){
   	 		if(num % i == 0 && i != 1){
      				return false;
    			}
  		}
  		return true;
		}

	}

