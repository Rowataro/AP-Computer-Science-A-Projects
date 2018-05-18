
import TurtleGraphics.*;
import BreezySwing.*;
public class test{
    public static void main(String args[]){
        StandardPen pen = new StandardPen(); //Create pen object
        pen.down(); //Needs in order to start drawing
        //Example
        makeSquare(pen);
    }
    public static void makeSquare(StandardPen pen){
        pen.move(25);
        pen.turn(90);
        pen.move(25);
        pen.turn(90);
        pen.move(25);
        pen.turn(90);
        pen.move(25);
    }
}