import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if(s.length() ==0){
            return true;
        }
        HashMap<Character,Character> hashmap = new HashMap<Character,Character>();
        hashmap.put('(',')');
        hashmap.put('[',']');
        hashmap.put('{','}');
        
        Stack<Character> stack = new Stack<Character>();
        for(int idx=0;idx<s.length();idx++){
            Character c = s.charAt(idx);
            if(hashmap.keySet().contains(c)){
                stack.push(c);
                continue;
            }
            if(hashmap.values().contains(c)){
                 if(!stack.isEmpty() && hashmap.get(stack.peek()) == c){
                    stack.pop();
                 }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}