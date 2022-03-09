import java.util.Scanner;

public class NoOfGrandChildren {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = 4, column = 2;
        String[][] arr = new String[row][column];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                arr[i][j] = sc.next();
            }
        }
        System.out.println("Enter the father name : ");
        String father = sc.next();

        String child = null;
        int count = 0;
        for(int i=0; i<row; i++)
        {
                if(arr[i][1].equals(father))
                {
                    child = arr[i][0];
                }
        }
        for(int i=0; i<row; i++)
        {
            if(arr[i][1].equals(child))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
