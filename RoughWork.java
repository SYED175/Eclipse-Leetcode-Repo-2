import java.util.Arrays;
import java.util.Scanner;

public class RoughWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] arr = {5,7,7,8,8,8,10};
		int target = 8;

				
				
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			int mid = left + (right-left)/2;
//			mid=mid+1;
//			
//	        System.out.println(nums[left]);
//	        if(nums[left]!=target)
//	            return res;

			
			//FOR LEFT Range || beginning of range
			//case 1: arr[mid]<target, then range of begin left=mid+1;
			//case 2: arr[mid]>target, then range begins at left side, right=mid-1;
			//case 3: arr[mid]==target, then range should begin at mid or on left side,right=mid;
			
			
			
			//FOR RIGHT range || end of range
			//case 1: arr[mid] < target, then range must be left = mid+1
			//case 2: arr[mid]>target, then end range must be right=mid-1
			//case 3: arr[mid]==target, then end range must be right=mid or greater
			
			//case 2 & 3: arr[mid]>=target , right = mid;
			
			if(arr[mid]>=target) {
				System.out.println(mid+" index,value  "+arr[mid]);
				right = mid;
			}
			else
				left = mid+1;
			

			
//			if(arr[mid]<=target) {
//				System.out.println(mid+" index,value  "+arr[mid]);
//				left=mid;
//			}
//			else
//				right = mid-1;
	
		}
	}

}
