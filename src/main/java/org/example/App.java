package org.example;

/**
 * MyStringBuilder
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyStringBuilder myBuilder = new MyStringBuilder(new StringBuilder());
        myBuilder.append("first line\n");
        myBuilder.append("second line");

        System.out.println("До undo");
        System.out.println(myBuilder);
        System.out.println();

        System.out.println("После undo");
        MyStringBuilder prevMyBuilder = myBuilder.undo();
        System.out.println(prevMyBuilder);
    }
}
