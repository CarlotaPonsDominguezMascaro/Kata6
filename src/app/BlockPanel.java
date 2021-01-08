package app;


import model.Block;
import view.BlockDysplay;

import javax.swing.*;
import java.awt.*;

public class BlockPanel extends JPanel implements BlockDysplay {
    private static final int SIZE = 100;
    private Block block;

    @Override
    public void paint(Graphics g){
        g.setColor(Color.darkGray);
        g.fillRect(0,0,getWidth(),getHeight());

        int d = Block.MAX * SIZE;
        g.setColor(Color.WHITE);
        for (int i = 0; i <= Block.MAX; i++) {
            int c = i*SIZE;
            g.drawLine(0,c,d,c);
            g.drawLine(c,0,c,d);
        }
        if(block == null) return;
        g.setColor(Color.red);
        g.fillRect((block.x()-1)*SIZE,(Block.MAX -block.y())*SIZE,SIZE,SIZE);

    }

    @Override
    public void dysplay(Block block) {
        this.block = block;
        repaint();
    }

    @Override
    public void change() {
        repaint();
    }
}
