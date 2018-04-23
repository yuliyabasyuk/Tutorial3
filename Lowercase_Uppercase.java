
public class Lowercase_Uppercase {

	public static void main(String[] args)
		throws java.io.IOException{
			char character;
			//the number of case changes
			int counter = 0;
			
			for( ; ; ) {
				character = (char) System.in.read();
					if(character == '\n') break;
					//convert character to ASCII number
					int ascii = (int) character;
						//uppercase --> lowercase (latin) 
						if((ascii > 64 & ascii < 91)) {
							counter++;
							System.out.print((char) (ascii+32));			
						}	else {
								//lowercase --> uppercase
								if((ascii > 96 & ascii < 123)) {
									counter++;
									System.out.print((char) (ascii-32));			
								}	else 
									//Make no changes to any other character
									System.out.print((char) ascii);	
							}
			}
			System.out.println(" ");
			System.out.println("The number of case changes is " + counter);

	}
}