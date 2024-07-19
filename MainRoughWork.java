import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainRoughWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		XORSwap();
//		swapNBits();
//		System.out.println(Integer.toBinaryString(47)+"fm");
//		increasingTripletsSubsequence();
//		groupAnagrams();
//		selectionSort();
		
//		patternMatch();
		command();
		
	}
	
	public static void XORSwap() {
		int x = 6;
		int y = 7;
		System.out.println(x +" is the value of x  ||"+y+" is the value of y --Before Swapping");
			
		x = x^y;
		y = y^x;
		x = x^y;
		
		System.out.println(x +" is the value of x  ||"+y+" is the value of y --After Swapping");
	}

	public static void swapNBits() {
		int num=47;
		int p1=1,p2=5;
		int n=3;
		
		char[] ch = Integer.toBinaryString(num).toCharArray();
		System.out.println(Integer.toBinaryString(num)+"string");
		int i = ch.length-1-p1;
		int j = ch.length-1-p2;
		while(n>0 && i>=0 && j>=0) {
			
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i--;j--;
			n--;
		}
		System.out.println(ch);
	}

	public static void increasingTripletsSubsequence() {
		 int[] arr = {1,10,2,3,6};
		 int n = arr.length;
		 List<Integer> li = new ArrayList<>();
		 li.add(1);
		 li.add(3);
		 li.add(4);
		 
		 Collections.sort(li,(a,b)->b-a);
		 for(Integer nf:li)
			 System.out.println(nf);
		 
//		//set first & second element to +ve infinity
//		 int first = Integer.MAX_VALUE;
//		 int second = Integer.MAX_VALUE;
//		 
//		 for(int i=0;i<n;i++) {
//			 if(arr[i]<)
//		 }
	}
	
	public static void groupAnagrams() {
		String val="abbbbbbbbbbb";
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		for(int i=0;i<strs.length;i++) {
			char[] ch = strs[i].toCharArray();
			Arrays.sort(ch);
			String s = new String(ch);
			strs[i]=s;
		}
		
		Arrays.sort(strs);
		Map<String,List<String>> hm = new HashMap<>();
		
		for(int i=0;i<strs.length;i++) {
			if(hm.get(strs[i])!=null) {//list not present
				hm.get(strs[i]).add(strs[i]);
			}
			else {
				List<String> li = new ArrayList<>();
				li.add(strs[i]);
				hm.put(strs[i], li);
			}
		}
		
		List<List<String>> list1 = new ArrayList<>();
		for(List<String> val2: hm.values()) {
//			System.out.println(val2.toString());
			list1.add(val2);
		}
		System.out.println(Arrays.toString(list1.toArray()));
		
		
//		System.out.println(Arrays.toString(strs));

	}

	public static void selectionSort() {
		int[] arr = {64,25,12,22,11};
		
		for(int i=0;i<arr.length-1;i++) {

			int minInd=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minInd]) {
					minInd=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minInd];
			arr[minInd]= temp;
		}
		
		for(int val:arr)
			System.out.println(val);
	}

	public static void patternMatch() {
		String pattern = "010";
		String match = "amazing";
		
		String vowels = "aeiou";
		int count=0;
		int plen=pattern.length();
		
		for(int i=0;i<=match.length()-plen;i++) {
			String contain="";
			
			for(int j=i;j<plen+i;j++) {
				contain+=(vowels.indexOf(match.charAt(j)))==-1?"1":"0";
			}
			if(contain.equals(pattern))
				count++;
			
		
		}
		
		System.out.println(count);
	}

	public static void command() {
		String[] commands=
			{
		"goto bucketA",
		"create filea",
		"create fileb",
		"create filea",
		"goto bucketB",
		"goto bucketC",
		"create filea",
		"create fileb",
		"create filec",
		"goto bucketA",
		"create filee",
		"create filed",
			};


		Map<String,Set<String>> hm = new HashMap<>();
		String prevCommandB = "";
		for(int i=0;i<commands.length;i++){

			String[] str = commands[i].split(" ");
			if(str[0].equals("goto")){
				if(hm.get(str[1])==null){
					Set<String> hs = new HashSet<>();
					hm.put(str[1],hs);
					prevCommandB=str[1];
				}
				else{
					prevCommandB=str[1];
				}
			}
			else{
				hm.get(prevCommandB).add(str[1]);
				hm.put(prevCommandB, hm.get(prevCommandB));
//				hm.put(prevCommandB,hm.get(prevCommandB));)
			}
		}


int max=-1;
String output="";
for(Map.Entry<String, Set<String>> gfg : hm.entrySet()){
	if(max<gfg.getValue().size()){
		max=gfg.getValue().size();
		output=gfg.getKey();
	}
}
System.out.println(output);
	}
}
