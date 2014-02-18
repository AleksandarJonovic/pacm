/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacm;

/**
 *
 * @author Alex
 */
public abstract class Entity {
    
    private int xPos;
    private int yPos;
    private boolean dead;
    
    public void move(int placeholder){
    
    }

    public boolean isDead() {
        return dead;
    }

    public int[] getPos() {
        int[] pos = new int[2];
        pos[0] = xPos;
        pos[1] = yPos;
        return pos;
    }
    
    
    
    
    }

