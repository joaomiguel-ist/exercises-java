//ongoing
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

		Scanner input = new Scanner (System.in);				
		double value;
		double adaptedvalue;
		double target = 0.0;
		int pos = 1;
		int i = 1;
		int[] count = {0,0,0,0,0,0,0,0,0};
		int[] arr = {0,1,2,5,10,20,50,100,200};

		System.out.println("input value to calculate");
    value = input.nextDouble();
		//System.out.println(value);
		//System.out.println();
		adaptedvalue = 100 * value;
    /*     
    for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		*/
		
		for(i=1; i<= 50; i++)
		{
			target = target + arr[pos];
			count[pos] += 1; 
		}

		pos += 1;
    //System.out.println("aqui");
  	//System.out.println(adaptedvalue);

		for(pos = 2; pos<=arr.length; pos++){
			
						
			while(target <= adaptedvalue)
			{
				while(i > 0)
				{
					target = target - arr[pos-1];
					count[pos-1] -= 1;
					target = target + arr[pos];
					count[pos] += 1;
					i--;
					System.out.println("aqui");
				}
				System.out.println("neps");
				break;
			}
		}

		
		
		System.out.println("the needed number of coins is");
		for(i = 1; i < count.length; i++)
		{
			System.out.println(arr[i] + ": " + count[i]);
		}

	}
}		
