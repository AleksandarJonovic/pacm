/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Aleksandar Jonovic
 */
public abstract class Ghost extends Entity{

    private int xPos;
    private int yPos;
    private boolean dead;
    
    @Override
    public void initPos(){}
    
    @Override
    public void move(){
    //Ghost movement logic here.
    
    }
    
}
