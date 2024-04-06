import java.util.Random;

public class Main
{
    public static int[][] flp_md(int xLength, int yWidth, int maxDistance)
    {
        Random r = new Random();
        int numberOfExecutions = 1;
        int exceeding_maxDistance = 0;
        int distance;
        int[][] Dist = new int[xLength][yWidth];
        
        int[] xCordinates = new int[4];
        int[] yCordinates = new int[4];
        
     do{
            xCordinates[0] = r.nextInt(10);
            yCordinates[0] = r.nextInt(10);
            xCordinates[1] = r.nextInt(10);
            yCordinates[1] = r.nextInt(10);
            xCordinates[2] = r.nextInt(10);
            yCordinates[2] = r.nextInt(10);
            xCordinates[3] = r.nextInt(10);
            yCordinates[3] = r.nextInt(10);

            exceeding_maxDistance = 0;
            
            for (int x = 0; x < xLength; x++){
                for (int y = 0; y < yWidth; y++){
                    Dist[x][y] = xLength + yWidth;

                    for (int i = 0; i < xCordinates.length; i++){
                        distance = Math.abs( xCordinates[i] - x ) + Math.abs( yCordinates[i] - y );
                        Dist[x][y] = Dist[x][y] > distance ? distance :  Dist[x][y];
                    }
                    
                    if(Dist[x][y] > maxDistance){
                        exceeding_maxDistance = 1;
                        System.out.println(numberOfExecutions + ". Some customers exceed the maximum distance from open facilities. Let's change the locations of the open facilities");
                        numberOfExecutions++;
                    }
                    
                }

            }

        }
        while(exceeding_maxDistance == 1);
        
        System.out.println(numberOfExecutions + ". YES!!! No customer exceeds the maximum distance from open facilities! Open Facilities are marked with zeros");
                            System.out.println();
        
        return Dist;
    }

    public static void main(String[] args)
    {
        int maxDistance = 5;
        int xLength2 = 10;
        int yWidth2 = 10;
        
        int[][] m2 = new int[yWidth2][xLength2];

        m2 = flp_md(xLength2, yWidth2, maxDistance);

        for (int i = 0; i < xLength2; i++) {
            for (int j = 0; j < yWidth2; j++) {
                System.out.print(m2[i][j] + " ");
            }
            
            System.out.println();

        }

    }

}
