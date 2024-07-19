import java.util.Scanner;

public class BitWiseBabbar {

	public static void main(String[] args) {


		//program to convert decimal to binary using & operator
		
		Scanner sc = new Scanner(System.in);


		int num = sc.nextInt();
//		After tilde operation, instead of displaying the number, it takes 2's complement, its obvious because the number becomes negative, as the left most bit becomes high,

		
		
		
		
		
		
		int res=0,j=0;
		while(num>0) {
			int bit = num&1;
			num=num>>1;
			res = bit*((int)Math.pow(10,j++)) + res;
		}
		System.out.println("Value in Binary  =  "+res);
		sc.close();
		
		//Next step, what if decimal is out of range, 
		
//		what if decimal in negative, how will you convert it

		
		
	}
	
	

}
