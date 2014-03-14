public class Solution{
	public int[] merge(int[] left, int[] right){
		int[] result;
		if( left.length == 0 ){
			result = Arrays.copyOfRange(right,0,right.length);
			return result;
		}else if( right.length == 0){
			result = Arrays.copyOfRange(left,0,left.length);
			return result;
		}
		result = new int[left.length+right.length];
		int lidx = 0;
		int ridx = 0;
		int reidx = 0;
		while(lidx<left.length && ridx <right.length){
			if(left[lidx] <= right[ridx]){
				result[reidx] = left[lidx];
				lidx++;				
			}else{
				result[reidx] = right[ridx];
				ridx++;
			}
			reidx++;
		}
		while(lidx<left.length){
			result[reidx] = left[lidx];
			reidx++;
			lidx++;
		}
		while(ridx<right.length){
			result[reidx] = right[ridx];
			reidx++;
			ridx++;
		}
		return result;

	public int[] mergesort(int[] A){
		if(A.length <= 1){
			return;
		}
		int[] left = mergesort(Arrays.copyOfRange(A,0,A.length/2));
		int[] right = mergesort(Arrays.copyOfRange(A,A.length/2,A.length));
		return merge(left,right);
	}
}