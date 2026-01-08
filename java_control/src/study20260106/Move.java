package study20260106;

import java.util.Scanner;

public class Move {

    public static void main(String[] args) {

        int[][] board = {
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,2,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        };

        Scanner scan = new Scanner(System.in);

        
        int py = 0, px = 0;
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if (board[i][k] == 2) {
                    py = i;
                    px = k;
                }
            }
        }

        while (true) {

            
            for (int i = 0; i < board.length; i++) {
                for (int k = 0; k < board[i].length; k++) {
                    if (board[i][k] == 1) System.out.print("■");
                    else if (board[i][k] == 0) System.out.print(" ");
                    else if (board[i][k] == 2) System.out.print("♥");
                }
                System.out.println();
            }

            System.out.print("wasd 입력 ");
            String num = scan.nextLine();

           
            char move = scan.nextLine().charAt(0);

      
                int movey = py;
                int movex = px;

                if (move == 'w') movey--;
                else if (move == 's') movey++;
                else if (move == 'a') movex--;
                else if (move == 'd') movex++;

        
                if (board[movey][movex] != 1) {
                	
                	board[py][px] = 0;
                    board[movey][movex] = 2;  
                    
                    py = movey;
                    
                    px = movex;
                	
                	
                    
                	
                }
            }
        }
    }


