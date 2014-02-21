/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Graphics.Board;
import Graphics.Field;

/**
 *
 * @author Aleksandar Jonovic
 */
public class Player extends Entity {

    private int xPos;
    private int yPos;
    private boolean dead;

    @Override
    public void initPos() {

    }

        public void move(Direction direction) {
        Field[][] fields = Board.INSTANCE.getFieldArray();
        
        int[] getDir = direction.getDirection();

        switch (direction) {

            case NORTH: fields[xPos][yPos] = null;
               //  fields[xPos + getDir[0]][yPos + getDir[1]] = this;
        
    
        }
    }

}
