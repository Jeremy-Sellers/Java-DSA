package ClassesLecture;

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("blue");
        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());

        cookieOne.setColor("red");
        System.out.println(cookieOne.getColor());
    }
}
