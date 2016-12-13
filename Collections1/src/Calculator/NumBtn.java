/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javax.swing.JButton;

/**
 *
 * @author austi
 */
public class NumBtn {
    
    JButton btn = new javax.swing.JButton();
    
    public NumBtn(JButton _btn, String s) {
        btn = _btn;
        btn.setText(s);
    }
         
}
