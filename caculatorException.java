import java.util.*;

public class caculatorException {
    public static void main(String args[]) {
        try {
            Rectangle r1 = new Rectangle();
            r1.input();
            r1.calculateArea();
            r1.calculatePerimeter();
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Rectangle {
    Scanner sc = new Scanner(System.in);
    float length;
    float breadth;
    float perimeter;
    float area;

    void input() throws NegativeValueException {
        System.out.println("Enter the length");
        length = sc.nextFloat();
        if (length < 0) {
            throw new NegativeValueException("Negative length");
        }

        System.out.println("Enter the breadth");
        breadth = sc.nextFloat();
        if (breadth < 0) {
            throw new NegativeValueException("Negative breadth");
        }
    }

    float calculateArea() {
        area = length * breadth;
        System.out.println("Area: " + area);
        return area;
    }

    float calculatePerimeter() {
        perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }
}

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}
