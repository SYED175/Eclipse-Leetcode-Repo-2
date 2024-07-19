import java.util.Scanner;

public class Rough2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		someFun();
		floatToBinaryPart2();

//		int[] arr = {1,2,3,4};
//		
//		int m=2;
//		
//		int mid = 10;
//		int i=0;
//		while(m>0 && i<arr.length) {
//			
//				int sum=arr[i];
//				while(sum<=mid && ++i<arr.length)
//					sum+=arr[i];	
//			
//			m--;
//		}
//		
//		
//		if(i<arr.length && m==0)
//			System.out.println("start=mid+1");
//		else if(i==arr.length && m==0)
//			System.out.println("end=mid-1");
//		else
//			System.out.println("end=mid-1+ else part");

	}
	
	public static void someFun() {

		// addition of 2 binary numbers
//		String a = "110";
//		String b = "110";
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		
		int res=0;
		int bal=0;
		StringBuilder sb = new StringBuilder();
		
	
		
		
//		both should be of same length; else make it same for shorter one by appending zeroes
		for(int i=a.length()-1;i>=0;i--) {

			int valueOfA = a.charAt(i)-'0';
			int valueOfB = b.charAt(i)-'0';
			
			res=valueOfA+valueOfB+bal;
			
			if(res>1) {
				bal=1;
				int val = res%2;
				sb.append(val);
			}
			else {
				sb.append(res);
				bal=0;
			}
		}
		
		if(bal!=0)
			sb.append(1);
		
	
		
		System.out.println("The sum of " +a+" and "+b+" in binary representation");
		System.out.println(Integer.parseInt(a,2)+" "+Integer.parseInt(b,2)+" in decimal representation");
		String str = sb.reverse().toString();
		System.out.println(str+" in binary");
		System.out.println(Integer.parseInt(str,2)+" in decimal");
	}

	public static void floatToBinary() {
		int n = 6;
		double res=0;
		int bit=0;
		int k=0;
		while(n!=0) {
			bit=n&1;
			res = bit*Math.pow(10, k++) + res;
			n=n>>1;
		}
		System.out.println((int)res);//typecasting to int
		
	}

	public static void floatToBinaryPart2() {
		double decimalNumber = 7.1;

        // Convert the integer part to binary
        int integerPart = (int) decimalNumber;
        String binaryIntegerPart = Integer.toBinaryString(integerPart);

        // Convert the fractional part to binary
        double fractionalPart = decimalNumber - integerPart;
        StringBuilder binaryFractionalPart = new StringBuilder(".");
        while (fractionalPart > 0) {
            fractionalPart *= 2;
            int bit = (int) fractionalPart;
            binaryFractionalPart.append(bit);
            fractionalPart -= bit;
            System.out.println(fractionalPart+" --");
        }
        String binaryRepresentation = binaryIntegerPart + binaryFractionalPart.toString();
        System.out.println(decimalNumber + " in binary is: " + binaryRepresentation);
    
	}
}
