
public class CanPlaceFlowers {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count=0;

		for (int i=0;i<flowerbed.length;i++) {
			if(flowerbed[i]==0) {

				try { 
					
				///if it is the starting index 
					
					if(flowerbed[i-1]!=1) {
						
						try {  
						///checking if it is the last index
						
							if(flowerbed[i+1]!=1) {
								count++;
								flowerbed[i]=1;
							}
						}catch(ArrayIndexOutOfBoundsException e) {
							count++;
							flowerbed[i]=1;
						}
					}
				}catch(java.lang.ArrayIndexOutOfBoundsException e) {
					try {
						if(flowerbed[i+1]!=1) {
							count++;
							flowerbed[i]=1;
						}
					}catch(java.lang.ArrayIndexOutOfBoundsException e1) {
						count++;
						flowerbed[i]=1;
					}
					
				}
			}
		}
		if(count>=n)
			return true;
		else
			return false;

	}
}
