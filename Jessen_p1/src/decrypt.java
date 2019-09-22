
public class decrypt {

	public void decryptNumbers(int numOnes, int numTens, int numHundreds, int numThousands)  {
		int temp3 = numOnes; 
		numOnes = numHundreds;
		numHundreds = temp3;
		
		int temp4 = numTens;
		numTens = numThousands; 
		numThousands = temp4;
				
		//  Subtract 7 from each digit and "unmod" by 10
		
		numOnes = ((10 + numOnes - 7) % 10);
		numTens = ((10 + numTens - 7) % 10);
		numHundreds = ((10 + numHundreds - 7) % 10);
		numThousands = ((10 + numThousands - 7) % 10);
		
		//  Output decrypted result
		
		System.out.println(numThousands + " " + numHundreds + " " + numTens + " " + numOnes);  

	}
}
