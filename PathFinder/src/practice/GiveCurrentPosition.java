package practice;
/*
16.Assume there exists infinite grid, you’re given initial position x, y. Inputs will be movements either L or R or U or D. After n inputs, you need to give the current position.

•	Input:

•	4 5 //initial position x, y

•	9 //number of movements

•	U L R R D D U L R //7 movements

•	Output:

5 5*/
public class GiveCurrentPosition {
    public static void main(String[] args) {
        int x = 4;
        int y  = 5;
        String path =  "ULRRDDULR";
        for(int i =0; i < path.length(); i++){
            if(path.charAt(i) == 'U')   y--;
            else if(path.charAt(i) == 'L')  x--;
            else if(path.charAt(i) == 'R')  x++;
            else y++;
        }
        System.out.println("x : " + x + " y : " + y);

    }
}
