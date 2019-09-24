import java.util.*;


class Q5 {
    public static void printChessPattern(String chess[][]){ //to print the array elemts in chess pattern
        int i, j;
        for (i=0; i<8; i++) {
            for (j = 0; j < 16; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void chessPattern(String chess[][], String white, String black){
        int i, j, flag=0;
        for (i=0; i<8; i++){
            for (j=0; j<16; j++){
                if(flag == 0 && j%2 == 0){
                    chess[i][j] = white;
                    flag = 1;
                }
                else if(flag == 1 && j%2 == 0){
                    chess[i][j] = black;
                    flag = 0;
                }
                if(j%2 != 0){
                    chess[i][j] = "|";
                }
                if(j == 15 && i%2 == 0){
                    flag = 1;
                }
                else if(j == 15 && i%2 != 0){
                    flag = 0;
                }
            }
        }
    }
    public static void main(String args[]){
        String chess[][] = new String[8][16];
        String white = "WW";
        String black = "BB";
        chessPattern(chess, white, black);
        printChessPattern(chess);
    }
}
