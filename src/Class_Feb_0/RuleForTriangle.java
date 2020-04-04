package Class_Feb_0;

public class RuleForTriangle
{
    public static void main(String[] args)
    {
        int A = 5;
        int B = 10;
        int C = 12;

        if (A+B>C)
        {
            System.out.print("Triangle Rule is Checked for A+B>C\n");
        }
        else
        {
            System.out.print("Doesn't follow the Triangle Rule for A+B>C\n");
        }
        if (A+C>B)
        {
            System.out.print("Triangle Rule is Checked for A+C>B\n");
        }
        else
        {
            System.out.print("Doesn't follow the Triangle Rule for A+C>B\n");
        }
        if (B+C>A)
        {
            System.out.print("Triangle Rule is Checked for B+C>A\n");
        }
        else
        {
            System.out.print("Doesn't follow the Triangle Rule for B+C>A\n");
        }
    }
}
