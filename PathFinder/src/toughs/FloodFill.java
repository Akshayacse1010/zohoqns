package toughs;

class FloodFill {
void dfs(int[][] img, int nr , int nc , int cc ,int color,   int[][] vis){
int n = img.length;
int c = img.length;
if(nr < 0 || nc < 0 || nr > n - 1 || nc > c - 1 || img[nr][nc] != cc || vis[nr][nc] == 1){
    return;
}
vis[nr][nc] = 1;
img[nr][nc] = color;
int[] dr = { 0 , 0,  -1 , 1};
int[] dc = {1 ,-1 , 0 , 0};
    for (int i = 0; i < 4; i++) {
        dfs(img, nr  +dr[i], nc + dc[i], cc, color, vis);
    }
}

    public int[][] floodFill(int[][] img, int sr, int sc, int color) {

        int[][] vis =  new int[img.length][img.length];
      dfs(img , sr ,sc ,img[sr][sc] , color  ,vis);
      return img;
    }

    public static void main(String[] args) {
        FloodFill ff = new FloodFill();
        int[][] img = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;

        int[][] result = ff.floodFill(img, sr, sc, newColor);

        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
//    void dfs(int nr, int nc, int[][] vis, int cc, int color, int[][] img) {
//
//    }