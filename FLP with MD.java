/** Created by stasa on 29.7.16.. **/

import java.util.Random;

public class Main
{
    public static int[][] get2DLockerLocation(int xLength, int yWidth)
    {
        Random r = new Random();
        int prekoracenje_maxDistance = 0;
        int tempMAX = 0;
        int maxDistance = 5;
        int distance;
        int[][] Dist = new int[xLength][yWidth];
        
        int[] xCordinates = new int[2];
        int[] yCordinates = new int[2];
        int brojIzvrsavanja = 1;
        
     do{
         
            System.out.println(brojIzvrsavanja + ". Some customers exceed the maximum distance from open facilities. Let's change the locations of the open facilities");
            brojIzvrsavanja++;
            xCordinates[0] = r.nextInt(5) + 1;
            yCordinates[0] = r.nextInt(5) + 1;
            xCordinates[1] = r.nextInt(5) + 1;
            yCordinates[1] = r.nextInt(5) + 1;

            prekoracenje_maxDistance = 0;
            
            for (int x = 0; x < xLength; x++)
            {
                for (int y = 0; y < yWidth; y++)
                {
                    Dist[x][y] = xLength + yWidth;

                    for (int i = 0; i < xCordinates.length; i++)
                    {
                        distance = Math.abs( xCordinates[i] - (x + 1) ) + Math.abs( yCordinates[i] - (y + 1) );
                        
                        Dist[x][y] = Dist[x][y] > distance ? distance :  Dist[x][y];
                    
                        
                    }
                    
                    if(Dist[x][y] > maxDistance)
                            prekoracenje_maxDistance = 1;

                }

            }
        }
        while( prekoracenje_maxDistance == 1);
        
        return Dist;
    }

    public static void main(String[] args)
    {
       
        int xLength2 = 5;
        int yWidth2 = 5;
        
        int[][] m2 = new int[yWidth2][xLength2];

        m2 = get2DLockerLocation(xLength2, yWidth2);

        for (int i = 0; i < xLength2; i++) {
            for (int j = 0; j < yWidth2; j++) {
                System.out.print(m2[i][j]);
            }
            
        System.out.println();
        
           
        }

    }

}
