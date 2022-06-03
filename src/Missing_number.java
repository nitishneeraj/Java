
public class Missing_number {

	public static int findDisappearedNumbers(int[] nums) {
		 int n=nums.length;
	        int sum=0;
	        for(int i=0;i<n;i++)
	          sum+=nums[i];
	        return n*(n+1)/2 -sum;
	}

	public static void main(String[] args) {
		int[] a = {3,0,1 };
		System.out.println(findDisappearedNumbers(a));
	}
}
