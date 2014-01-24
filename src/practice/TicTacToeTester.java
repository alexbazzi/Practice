package practice;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author alexbazzi
 */
import java.util.Scanner;

public class TicTacToeTester 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String player = "x";
        TicTacToe game = new TicTacToe();
        boolean done = false;
        while(!done)
        {
            System.out.println(game.toString());
            System.out.println("Row for " + player + " (-1 to exit): ");
            int row = in.nextInt() - 1;
            
            if(row < 0) done = true;
            else
            {
                System.out.println("Column for " + player + ": ");
                int column = in.nextInt() - 1;
                game.set(row, column, player);
                if(player.equals("x")) player = "o";
                else player = "x";
            }
            
            int i = 0, j = 0;
            if(game.getPlayer(i, j).equals(player) && game.getPlayer((i++), j).equals(player) 
                            && game.getPlayer((i + 2), j).equals(player) || game.getPlayer(i, j).equals(player)
                            && game.getPlayer(i, (j++)).equals(player) && game.getPlayer(i, (j + 2)).equals(player))
                System.out.println(player + "won the game!");
            else
                System.out.println("shiet");
            }
        }
    }

