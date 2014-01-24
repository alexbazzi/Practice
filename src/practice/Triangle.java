package practice;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author alexbazzi
 */
public class Triangle 
{
    public Triangle(int aWidth)
    {
        width = aWidth;
    }
    
    public int getArea()
    {
        if(width <= 0) return 0;
        if(width == 1) return 1;
        Triangle smallerTriangle = new Triangle(width -1);
        int smallerArea = smallerTriangle.getArea();
        return smallerArea + width;
    }
    
    private int width;
}
