//int [] arr= {-10,-9,1,2,4,3,-6,-5};


public class HighestOfThree {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			int [] arr= {-10,1,2,4,3,-6,-9};
			if(arr.length<3) {
				throw new Exception("Cant be less than 3");
			}
			
			int highOf2=arr[0]*arr[1];
			int lowOf2=arr[0]*arr[1];
			int lowest=arr[0];
			int highest=arr[0];
			int max=arr[0]*arr[1]*arr[2];
			
			for(int i=2;i<arr.length;i++) {
				int current=arr[i];
				
				max=Math.max(max, Math.max(current*highOf2, lowOf2*current));
				
				highOf2=(Math.max(highOf2, highest*current));
				lowOf2=(Math.min(lowOf2, lowest*current));
				
				lowest=Math.min(Math.min(lowest, arr[i-2]), Math.min(arr[i], arr[i-1]));
				highest=Math.max(Math.max(highest, arr[i-2]), Math.max(arr[i], arr[i-1]));
				
				
			}
			System.out.print(max);
	}

}

