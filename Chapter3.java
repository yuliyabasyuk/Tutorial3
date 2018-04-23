
public class Chapter3 {

	public static void main(String[] args) 
	throws java.io.IOException {
		char read; 
		do{
			 read = (char) System.in.read();
			 System.out.println(read);
		} while (read != 'r');
	}
}
