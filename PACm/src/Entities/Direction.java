/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 *
 * @author Alex
 */
public enum Direction {
    
    NORTH(1,0),
    SOUTH(-1,0),
    EAST(0,1),
    WEST(0,-1),
    NORTHEAST(1,1),
    NORTHWEST(1,-1),
    SOUTHEAST(-1,1),
    SOUTHWEST(-1,-1);
    
    Direction(int x, int y){
        this.xPos = x;
        this.yPos = y;

    }
    private final int xPos;
    private final int yPos;
    
    
    public int[] getDirection(){
        int[] direction = new int[2];
        
        direction[0] = xPos;
        direction[1] = yPos;
        
        return direction;
    }
}
