public class Solution{
	public String IntoString(Integer in){
		if(in == null){
			return null;
		}
		boolean neg = false;
		if(in == Integer.MIN_VALUE){
			return "-21***"; //TODO add the real Integer.MIN_VALUE
		}
		if(in <0){
			neg = true;
			in = -in;
		}else if(in ==0){
			return "0";
		}
		
		String result = "";
		while(in != 0){
			result =  (char)((char)in%10+'0') + result;
			in = in/10;
		}
		return result;
	}
}