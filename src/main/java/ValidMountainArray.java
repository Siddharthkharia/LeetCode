import java.util.Arrays;

public class ValidMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {9,8,7,6,5,4,3,2,1,0};
		
		//System.out.println(validMountainArray(a));
		System.out.println(test(a));

	}

	public static boolean validMountainArray(int[] arr) {
		int count=0;
		int temp=Integer.MIN_VALUE;
		
		if(arr.length<3)
			return false;

		for(int i=0;i<arr.length;i++) {

			if(count>2) {
				return false;
			}
			else {
				if(count==2) {
					if(arr[i]>temp)
						count++;
				}
				else {
					if(count<1) {
						if(arr[i]>=temp)
							count++;
					}
					else {
						if(count==1) {
							if(arr[i]<=temp)
								count++;
						}
					}
				}
			}
			temp=arr[i];
		}
		return count==2?true:false;
	}
	
	
	public static boolean test(int[] a) {
		
		if(a.length<3) {
			return false;
		}
	
		
		int count=0;

		int temp=Integer.MIN_VALUE;
		
	
		for(int i=0;i<a.length;i++) {
			
			if(count>2||a[i]==temp) {
				return false;
			}
			
			if(count==0) {
				if(a[i]<=temp) {
					return false;
				}
				else
					count++;
			}
			else {
				if(count==1) {
					if(a[i]<=temp) {
						count++;
					}
				}
				else {
					if(count==2) {
						if(a[i]>=temp) {
							count++;
						}
					}
				}
			}
			temp=a[i];
		}
		return count==2 ? true:false;
	}

}
