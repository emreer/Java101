public class Main {
    public static void main(String[] args) {


// * * * * * *
// *           *
// *           *
// *           *
// * * * * * *
// *           *
// *           *
// *           *
// * * * * * *

        //String veri tipinde çok boyutlu dizi tanımlandı.
        String[][] letter = new String[9][7];
        System.out.println();
        for (int i = 0; i < letter.length; i++)
        {
            for (int j = 0; j < letter[i].length; j++)
            {
                if (i == 0 || i == 4 || i == 8)
                {
                    letter[i][j] = " * ";
                    letter[8][6] = " ";
                }
                else if (j == 0 || j==6)
                {
                    letter[i][j] = " * ";
                    letter[0][6] = " ";
                    letter[4][6] = " ";

                }
                else
                {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter)
        {
            for (String col : row)
            {
                System.out.print(col);
            }

            System.out.println();
        }
    }
}

