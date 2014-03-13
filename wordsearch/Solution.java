import java.util.Stack;

public class Solution {
//     
//     public class BoardNode {
//         char val;
//         int row;
//         int col;
//         BoardNode(char c, int i,int j){
//             val = c;
//             row = i;
//             col = j;
//         }
//     }
//     
//     public ArrayList<BoardNode> neight(BoardNode node, char[][] board){
// 		//TBD, verify the board size
// 		ArrayList<BoardNode> 
// 		int row = board.length;
// 		int col = board[0].length;
// 		int nrow = node.row;
// 		int ncol = node.col;
// 		if(nrow-1>=0){
// 		}
// 		
//     }
    
    public boolean dfs(char[][] board, boolean[][] visited, int i,int j, String word){
    	//if(word.equals(Character.toString(board[])){
    	char c = word.charAt(0);
    	if(word.length == 1){
    		if(board[i][j] == c){
    			return true;
    		}else{
    			return false;
    		}
    	}
    	if(i-1 >=0 && visited[i-1][j]){
    		
    	}
    }
    
    public boolean exist(char[][] board, String word) {
        if(board.length == 0){
            return false;
        }
        if(word.length() == 0){
            return true;
        }
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int i=0;i<row;i++){
        	for(int j=0;j<row;j++){
    			if(dfs(board, visited, i,j,word)){
    				return true;
    			}
        	}
        }
        return false;
    }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                char c = board[i][j];
                //TreeNode node = new TreeNode(c);
                BoardNode boardnode = new boardnode(c,i,j);
                ArrayList<BoardNode> tmp;
                if(hashmap.containsKey(c)){
                    tmp = hashmap.get(c);

                }else{
                    tmp = new ArrayList<BoardNode>();
                }
                tmp.add(boardnode);
                hashmap.put(c,tmp);
            }
        }
        Stack<BoardNode> stack = new Stack<BoardNode>();
        int idx = 0;
        if(!hashmap.containsKey(word.charAt(idx))){
            return false;
        }else{
                for(BoardNode node:ArrayList<BoardNode>){
                    stack.push(node);
                }            
        }
        for(idx=1;idx<word.length;idx++){
            
        }
        
        
        
        
        do{
            char fc = word.charAt(idx);
            if(hashmap.containsKey(fc)){
                for(BoardNode node:ArrayList<BoardNode>){
                    stack.push(node);
                }
                idx++;
            }else{
                if(stack.isEmpty()){
                    break;
                }else{
                    stack.pop();
                    idx--;
                }
            }
            
        }while(!stack.isEmpty() && idx<word.length);
        if(idx == word.length){
            return true;
        }else{
            return true;
        }
    }
}

    public class Solution {  
        private int row;  
        private int col;  
        public boolean exist(char[][] board, String word) {  
            row = board.length;  
            col = board[0].length;  
            boolean[][] visited = new boolean[row][col];  
            for (int i = 0; i < row; i++) {  
                for (int j = 0; j < col; j++) {  
                    if (dfs(board, word, 0, i, j, visited))  
                        return true;  
                }  
            }  
            return false;  
        }  
      
        private boolean dfs(char[][] board, String word, int index, int rowindex,  
                int colindex, boolean[][] visited) {  
            if (index == word.length())  
                return true;  
            if (rowindex < 0 || colindex < 0 || rowindex >= row || colindex >= col)  
                return false;  
            if (visited[rowindex][colindex])  
                return false;  
            if (board[rowindex][colindex] != word.charAt(index))  
                return false;  
            visited[rowindex][colindex] = true;  
            boolean res = dfs(board, word, index + 1, rowindex - 1, colindex,  
                    visited)  
                    || dfs(board, word, index + 1, rowindex + 1, colindex, visited)  
                    || dfs(board, word, index + 1, rowindex, colindex + 1, visited)  
                    || dfs(board, word, index + 1, rowindex, colindex - 1, visited);  
            visited[rowindex][colindex] = false;  
            return res;  