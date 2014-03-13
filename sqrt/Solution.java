class public sqrt{
	public double sqrt(int x){
		double result = x/2;
		double last = result;
		double up = (double)x;
		double low = 0.0d;		
		do{
			if(result*result > x){
				up = result;
			}else{
				low = result;
			}
			result = (up+low)/2d;
		}while(Math.abs(result-last) < 0.0001);
		return result;
	}
};