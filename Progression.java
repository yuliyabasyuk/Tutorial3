import java.lang.Math;
public class Progression {
	

	public static void main(String[] args) {
		//standart solution
		for(int i = 0; i < 11; i++){
			int power = (int) Math.pow(2, i);
				System.out.println(power);	
		}
		
		System.out.println(" ");
		
		//the loop control variable can change in any arbitrary way 
		for(int i = 1; i < 1025; i*=2){			
				System.out.println(i);	
		}

	}

}
