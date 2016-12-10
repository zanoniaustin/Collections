/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.awt.Color;
import static kiss.API.*;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Padels {
    private static final int WIDTH = 10, HEIGHT = 60;
    private final Pong game;
    private int up, down, x, y, cy;
    
    public Padels(Pong _game, int _up, int _down, int _x) {
        game = _game;
        x = _x;
        up = _up;
        down = _down;
        y = game.getHeight() / 2;
    }
    
    public void updateHeight() {
        if (y > 0 && y < game.getHeight() - HEIGHT - 29)
            y += cy;
        else if(y == 0)
            y++;
        else if (y == game.getHeight() - HEIGHT - 29)
            y--;
    }
    
    public void pressedKey(int key){
        if (key == up)
            cy = 1;
        else if (key == down)
            cy = -1; 
    }
    
    public void releasedKey(int key) {
        if (key == up || key == down)
            cy = 0;
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }
}
