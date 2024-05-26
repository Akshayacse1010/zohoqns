public class Main {
    static int[][] grid = {
            {1, 0, 0, 1},
            {1, 0, 1, 0},
            {1, 1, 1, 0},
            {0, 1, 1, 1}
    };

    static int count;

    public static void main(String[] args) {
        int startX = 1;
        int startY = 2;
        int destX = 0;
        int destY = 0;

        count = 0;
        boolean[][] visited = new boolean[grid.length][grid.length];
        dfs(startX, startY, destX, destY, visited);
        System.out.println("Number of possible paths: " + count);
    }

    static void dfs(int x, int y, int destX, int destY, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid.length || grid[x][y] == 0 || visited[x][y])
            return;

        if (x == destX && y == destY) {
            count++;
            return;
        }

        visited[x][y] = true;

        dfs(x + 1, y, destX, destY, visited);
        dfs(x - 1, y, destX, destY, visited);
        dfs(x, y + 1, destX, destY, visited);
        dfs(x, y - 1, destX, destY, visited);

        visited[x][y] = false;
}
//        static void dfs(int x, int y, int destX, int destY, boolean[][] visited) {
//            if(x >= grid.length || y >= grid.length  || x < 0 || y < 0 || grid[x][y] == 0 || visited[x][y]){
//                return;
//            }
//            if(x == destX && y == destY){
//count++;
//return;
//            }
//            visited[x][y] = true;
//            int[] dr = {-1 ,1 , 1, -1};
//            int[] dc = {1 , -1 , 1 ,-1};
//            for(int i = 0; i < 4; i++){
//                dfs(x  + dr[i] , x  +dc[i] , destX  ,destY , visited);
//            }
//            visited[x][y]  = false;
//        }

}
