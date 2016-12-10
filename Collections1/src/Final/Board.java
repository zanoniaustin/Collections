/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.JPanel;

/**
 *
 * @author austi
 */
public class Board extends JPanel implements ActionListener, KeyListener{

    private final Pong game;
    private final Ball ball;
    private final Padels player1, player2;
    private int score1, score2;
    
    public Board(Pong _game){
        setBackground(Color.BLACK);
        game = _game;
        ball = new Ball(_game);
        player1 = new Padels(_game, KeyEvent.VK_UP, KeyEvent.VK_DOWN, game.getWidth() - 36);
        player2 = new Padels(_game, KeyEvent.VK_W, KeyEvent.VK_S, 20);
        Timer timer = new Timer(5, this);
        timer.start();
        addKeyListener(this);
    }
    
    public Padels getPlayer(int playerNumber) {
        if (playerNumber == 1)
            return player1;
        else
            return player2;
    }
    
    public void increaseScore(int playerNumber) {
        if (playerNumber == 1)
            score1++;
        else
            score2++;
    }
    
    public int getScore(int playerNumber) {
        if (playerNumber == 1)
            return score1;
        else
            return score2;
    }
    
    private void update() {
        ball.updateBall();
        player1.updateHeight();
        player2.updateHeight();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        player1.pressedKey(e.getKeyCode());
        player2.pressedKey(e.getKeyCode());
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        player1.releasedKey(e.getKeyCode());
        player2.releasedKey(e.getKeyCode());
    }


    @SuppressWarnings("empty-statement")
    @Override
    public void keyPressed(KeyEvent e) {;}
}
