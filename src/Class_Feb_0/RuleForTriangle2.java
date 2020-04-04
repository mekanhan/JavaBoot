package Class_Feb_0;

public class RuleForTriangle2
{
    public static void main(String[] args)
    {
        int A = 5;
        int B = 10;
        int C = 12;

        if ( (A+B>C) && (A+C>B) && (B+C>A) )
        {
            System.out.print("Triangle Rule is Checked");
        }
        else
        {
            System.out.print("Doesn't follow the Triangle Rule");
        }

    }
}
