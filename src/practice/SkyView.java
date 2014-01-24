package practice;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author alexbazzi
 */
public class SkyView
{
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        int k = 0;
        int n = 0;
        rows = numRows;
        columns = numCols;
        for (int i = 0; i < numCols; i++)
        {
            if( i != 2 * n + 1)
            {
                for(int j = 0; j < numCols; j++)
                {
                    view[i][j] = scanned[k];
                    k++; n++;
                }
            }
            else if( i != 2 * n + 1)
            {
                for(int j = numCols - 1; j >= 0; j--)
                {
                    view[i][j] = scanned[k];
                    k++; n++;
                }
            }
        }
    }
    
    public int getRows()
    {
        return rows;
    }
    public int getCols()
    {
        return columns;
    }
    
    public double[][] getView()
    {
        return view;
    }
            
    
    private double view[][];
    private int rows;
    private int columns;
    
}
