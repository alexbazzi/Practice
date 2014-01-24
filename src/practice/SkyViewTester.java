package practice;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author alexbazzi
 */
public class SkyViewTester
{
        public static void main(String[] args)
    {
        double[] arraySky = new double[10];
        for (int i = 0; i < arraySky.length; i++)
        {
            arraySky[i] = i*i;
        }
        SkyView sky = new SkyView(4, 3, arraySky);
        for (int i = 0; i < sky.getRows(); i++)
        {
            for (int j = 0; j < sky.getCols(); j++)
            {
                System.out.println(sky.getView());
            }
        }
    }
}
