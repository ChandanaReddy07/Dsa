class Solution {
   public int orangesRotting(int[][] grid) {
            
        int[][] directions = new int [][]{
            {-1, 0}, 
            {0, 1},  
            {1, 0},  
            {0, -1}  
        };
        
        if(grid.length == 0 || grid[0].length == 0)
            return 0;
        
        int numberOfFreshOranges = 0;
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    numberOfFreshOranges++;
                } else if(grid[i][j] == 2){
                    queue.add(new int[]{i, j});         
                }
            }
        }
        
        int numberOfRottenOranges = queue.size();
        
        if(numberOfFreshOranges > 0  && numberOfRottenOranges == 0){
            return -1;
        } else if(numberOfFreshOranges == 0){
            return 0;
        }
        
        int count = 0;
        
        // initialized to -1 to ignore first round of existing rotten oranges
        int minutes = -1;
        while(!queue.isEmpty()){
            int[] currentOrange = queue.poll();
            count++;
            int row = currentOrange[0];
            int col = currentOrange[1];
              
            for(int i = 0; i < directions.length; i++){
                int[] direction = directions[i];
                int nextRow = row + direction[0];
                int nextCol = col + direction[1];
                
                if(nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length)
                    continue;
                
                if(grid[nextRow][nextCol] == 1){
                    queue.add(new int[]{nextRow, nextCol});
                    grid[nextRow][nextCol] = 2; 
                    numberOfFreshOranges--;
                }    
            }
            
            if(count == numberOfRottenOranges){
                count = 0;
                numberOfRottenOranges = queue.size();
                minutes++;
            }
        }
        
        if(numberOfFreshOranges > 0)
            return -1;
        
        return minutes;
    }
}

