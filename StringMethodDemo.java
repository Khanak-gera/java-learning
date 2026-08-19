public class StringMethodDemo{

public static void main(String[]args)
{
    String greeting = "hello";
    String target = " , world!";

    int len = greeting.length();
    System.out.println("length of greeting : " + len);

    String combined = greeting.concat(target);
    System.out.println("combined string : " + combined ) ;

    String sub = combined.substring(0,5);
    System.out.println("extracted substring: " + sub);

    boolean startsWithHello = combined.startsWith("Hello");
    System.out.println("starts with 'hello' :" + startsWithHello);


}
}
