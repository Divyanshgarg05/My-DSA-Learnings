package Backtracking;

public class RatInAMaze {

    static void printSolution(int sol[][], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(sol[i][j] + " ");
        }
        System.out.println();
    }
}
static void solveMaze(int maze[][]) {
    int n = maze.length;
    int sol[][] = new int[n][n];

    if (!solveMazeUtil(maze, 0, 0, sol, n)) {
        System.out.println("No path exists");
        return;
    }

    printSolution(sol, n);
}


    public static boolean isSafe(int[][] maze, int x, int y, int n) {
    return (x >= 0 && x < n &&
            y >= 0 && y < n &&
            maze[x][y] == 1);
}

    public static boolean solveMazeUtil(int[][] maze,int x,int y,int[][] sol,int n){
        if(x == n-1 && y==n-1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }

        if(isSafe(maze,x,y,n)){
            sol[x][y] = 1;
            maze[x][y] = 0;   // visited
            //move down
            if(solveMazeUtil(maze, x+1, y, sol, n)){
                return true;
            }

            //move right
             if(solveMazeUtil(maze, x, y+1, sol, n)){
                return true;
            }


            //move up
             if(solveMazeUtil(maze, x-1, y, sol, n)){
                return true;
            }


            //move left
             if(solveMazeUtil(maze, x, y-1, sol, n)){
                return true;
            }
            //backtracking
            sol[x][y] = 0;
            maze[x][y] = 1;   // backtrack
            return false;

        }
        return false;
    }


    public static void main(String[] args) {

    int maze[][] = {
        {1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}
    };

    solveMaze(maze);
}

}
