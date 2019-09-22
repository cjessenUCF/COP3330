
public class encrypt {

	public void encryptNumbers(int numOnes, int numTens, int numHundreds, int numThousands) 
	{
		numOnes = ((numOnes + 7) % 10);
		numTens = ((numTens + 7) % 10);
		numHundreds = ((numHundreds + 7) % 10);
		numThousands = ((numThousands + 7) % 10);
		
		//  Swap specified digits
		
		int temp = numOnes; 
		numOnes = numHundreds;
		numHundreds = temp;
		
		int temp2 = numTens;
		numTens = numThousands; 
		numThousands = temp2;
		
		//  Output encrypted result
		
		System.out.println(numThousands + " " + numHundreds + " " + numTens + " " + numOnes); 

	}
}
