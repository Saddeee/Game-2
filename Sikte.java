/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author said.said
 */
public class Sikte {
    int x,y,radie;

    public Sikte(int x, int y, int radie) {
        this.x = x;
        this.y = y;
        this.radie = radie;
    }
    
    public void rita(Graphics g){
        g.setColor(Color.red);
        g.drawOval(x-radie, y-radie, radie*2, radie*2);
        g.setColor(Color.blue);
        g.drawLine(x-radie, y, x+radie, y);
        g.setColor(Color.blue);
        g.drawLine(x, y-radie, x, y+radie);
    }
}
