/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JOptionPane;

/**
 *
 * @author austi
 */
public class Ball {
    private static final int WIDTH = 30, HEIGHT = 30;
    private final Pong game;
    private int x, y, cx = 2, cy = 2;
    
    public Ball(Pong _game){
        game = _game;
        x = _game.getWidth() / 2;
        y = _game.getHeight() / 2;
    }
    
    public void updateBall(){
        x += cx;
        y += cy;
        if (x < 0) {
            game.getBoard().increaseScore(1);
            x = game.getWidth() / 2;
            cx = -cx;
        }
        else if(x > game.getWidth() - WIDTH - 7) {
            game.getBoard().increaseScore(2);
            x = game.getWidth() / 2;
            cx = -cx;
        }
        else if (y < 0  || y > game.getHeight() - HEIGHT - 29) 
            cy = -cy;
        
        if (game.getBoard().getScore(1) == 10)
            JOptionPane.showMessageDialog(null, "Player 1 wins!!", "Pong", JOptionPane.PLAIN_MESSAGE);
        else if (game.getBoard().getScore(2) == 10)
            JOptionPane.showMessageDialog(null, "Player 2 wins!!", "Pong", JOptionPane.PLAIN_MESSAGE);
           
        checkCollision();
    }
    
    public void checkCollision() {
        if(game.getBoard().getPlayer(1).getBounds().intersects(getBounds()) || game.getBoard().getPlayer(2).getBounds().intersects(getBounds()))
            cx = -cx;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }
    
}
