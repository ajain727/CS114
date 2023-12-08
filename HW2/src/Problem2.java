public class Problem2 {
    public static void main(String[]args)
{
    int x,y; // It was a syntax error because there was no spacing between the declaration and the variable name.
    x=5;
    y=1;
    while(x>0)
{
        x=x-1;
        y=y*x;
        System.out.println(y);
}
}
}
