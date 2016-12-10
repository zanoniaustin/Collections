/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import static kiss.API.*;
import java.awt.Color;
import javax.swing.JFrame;

public class Pong extends JFrame{
   
    private static final int WIDTH = 700, HEIGHT = 450;
    private final Board board;
    
    public Pong() {
        setSize(WIDTH, HEIGHT);
        setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        board = new Board(this);
        add(board);
    }
    
    public Board getBoard() {
        return board;
    }

    public static void main(String[] args) {
        Pong pong = new Pong();
    }
}
