import java.util.*;

public class Triangle extends MimshakMishtamesh {

    //option1--perimeter
    public static void CalcPerimeter(double width,double height)
    {
        double inTheSqrt = width * width + height * height;
        double yeter = Math.sqrt(inTheSqrt);
        double perimeter;
        System.out.println("היקף המשולש הוא: " + 2 * yeter + width);
    };

     //option2--print
    public static void PrintTriangle (double width,double height) {
        if ((width % 2 == 0) || (width > (2 * height)))
            System.out.println("אי אפשר להדפיס את המשולש");
        else if ((width % 2 != 0) && (width < (2 * height))) {
            //חישובים מקדימים
            int groups = (int) (width - 2) / 2;  // חישוב מספר קבוצות של כוכבים מלבד השורה הראשונה והאחרונה
            int lines = (int) (height - 2) / groups; // חידוב מספר שורות שיהיו בכל קבוצה
            int rest = (int) (height - 2) % groups; //חישוב שארית חלוק
            int i;
            //התחלת הדפסה
            System.out.println("*");// הדפסת שורה ראשונה שתמיד תהיה כוכבית אחת
            if (rest != 0) // בדיקה אם יש שארית והוספת שורות למשולש לקבוצה הראשונה אם כן
                for (i = 1; i <= rest; i++) {
                    System.out.println("***");
                }
            int temp = 3;
            int length = 3;
            int spaceLength;

            int j ;

            for (i = 1; i <= groups; i++)  // מעבר על מספר הקבוצות
            {
                for (j = 1; j <= lines; j++) //מעבר על מספר השורות בקבוצה
                {
                    //חישוב אורך התו רווח
                    spaceLength = (int) (width / 2) - length;
                    //הדפסת רווחים
                    PrintLine(' ', spaceLength);
                    PrintLine('*', length);
                    System.out.println();
                    length = temp;
                }
                temp = temp +2; //דילוג לאי זוגי הבא
                length = temp;
            }
            PrintLine('*', (int) width);
        }
        ;

    }

    private static void PrintLine(char c, int len) {
        int tmpLen = len;
        while (tmpLen != 0) {
            System.out.print('*');
            tmpLen--;
        }
     }
    }

