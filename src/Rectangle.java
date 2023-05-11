import java.util.*;
import java.util.List;

public class Rectangle extends MimshakMishtamesh {

    public Rectangle() {
        double remainder = height - width;
        if ((height == width) || (Math.abs(remainder) > 5))
            System.out.println("שטח המלבן " + height * width);
        else
            System.out.println("היקף המלבן " + (height + width) * 2);
    }
}