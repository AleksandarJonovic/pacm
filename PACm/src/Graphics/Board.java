package Graphics;

import java.util.Random;

/**
 *
 * @author Andreas
 */
public class Board 
{
    private final Field[][] fields;
    private final int x;
    private final int y;
    public static final Board INSTANCE = new Board(10);
    
    private Board(int size)
    {
        x = size;
        y = size;
        fields = new Field[y][x];
    }
    
    public Field[][] getFieldArray()
    {
        return fields;
    }
    
    public void generateBoard()
    {
        for (int i = 0; i < y; i++)
        {
            for (int j = 0; j < x; j++)
            {
                if (i == 0 || j == 0 || i == y-1 || j == x-1){
                    fields[i][j] = new Wall(j, i);
                    continue;
                }
                
                Boolean floor = false;
                for(Field f : getNeighboors(i, j))
                {
                    if (f == null) {}
                    else if (getFloorsAroundMe(f.y, f.x) < 2)
                        floor = true;
                }
                
                if (floor) fields[i][j] = new Floor(j, i);
                else {
                    if (getFloorsAroundMe(i,j) < 1){
                        fields[i][j] = new Wall(j, i);
                        continue;
                    }
                    
                    Random rand = new Random();
                    int r = rand.nextInt(2);
                    if (r == 0) fields[i][j] = new Wall(j, i);
                    else fields[i][j] = new Floor(j, i);
                }
            }
        }
    }
    
    private int getFloorsAroundMe(int y, int x)
    {
        int i = 0;
        
        if (y > 0)
            if(fields[y-1][x] instanceof Floor)
                i++;
        if (x > 0)
            if(fields[y][x-1] instanceof Floor)
                i++;
        if (y < this.y-1)
            if(fields[y+1][x] instanceof Floor)
                i++;
        if (x < this.x-1)
            if(fields[y][x+1] instanceof Floor)
                i++;
        
        return i;
    }
    
    private Field[] getNeighboors(int y, int x)
    {
        int i = 0;
        Field[] fs = new Field[4];
        
        if (y > 0)
            fs[i++] = fields[y-1][x];
        if (x > 0)
            fs[i++] = fields[y][x-1];
        if (y < this.y-1)
            fs[i++] = fields[y+1][x];
        if (x < this.x-1)
            fs[i] = fields[y][x+1];
        
        if (i == 0) return null;
        
        Field[] fr = new Field[i];
        System.arraycopy(fs, 0, fr, 0, i);
        return fr;
    }
}
