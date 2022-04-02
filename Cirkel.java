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
public class Cirkel {
    int x,y,bredd,höjd;
    Color färg;

    public Cirkel(int x, int y, int bredd, int höjd, Color färg) {
        this.x = x;
        this.y = y;
        this.bredd = bredd;
        this.höjd = höjd;
        this.färg = färg;
    }
    
    public void rita(Graphics g){
        g.setColor(färg);
        g.fillRect(x, y, bredd, höjd);
       
    }

    @Override
    public String toString() {
        int avstånd = (int) Math.sqrt((150-x)*((150-x)+(150-y)*(150-y)));
        return Integer.toString(avstånd);
    }
    
    
}
