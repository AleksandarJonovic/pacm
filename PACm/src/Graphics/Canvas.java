/*
 */

package Graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Andreas
 */
public class Canvas extends javax.swing.JPanel 
{
    private int fieldSize = 20;
    private Field[][] f;
    
    public Canvas()
    {
        Board b = new Board(10);
        b.generateBoard();
        f = b.getFieldArray();
        
        
        repaint();
    }
    
    @Override
    public void paint(Graphics g)
    {
        for (int y = 0; y < 10; y++)
            for (int x = 0; x < 10; x++)
            {
                if (f[y][x] instanceof Wall)
                    g.setColor(Color.black);
                else if (f[y][x] instanceof Floor)
                    g.setColor(Color.white);
                g.fillRect(x*fieldSize, y*fieldSize, fieldSize, fieldSize);
            }
    }
}
