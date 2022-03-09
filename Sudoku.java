import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        //row check
        for(int i=0; i<9; i++)
        {
            int count = 0;
            for(int j=0; j<9; j++)
            {
                count+= arr[i][j];
            }
            if(count!=45)
            {
                System.out.println("Invalid Sudoku");
                return;
            }
        }

        //column check
        for(int i=0; i<9; i++)
        {
            int count = 0;
            for(int j=0; j<9; j++)
            {
                count+= arr[j][i];
            }
            if(count!=45)
            {
                System.out.println("Invalid Sudoku");
                return;
            }
        }

        //sub matrix check
        for(int i=0; i<9; i+=3)
        {
            for(int j=0; j<9; j+=3)
            {
                int count = 0;
                for(int k=i; k<i+3; k++)
                {
                    for(int l=j; l<j+3; l++)
                    {
                        count+= arr[k][l];
                    }
                }
                if(count!=45)
                {
                    System.out.println("Invalid Sudoku");
                    return;
                }
            }
        }
        System.out.println("Valid Sudoku");
    }
}
