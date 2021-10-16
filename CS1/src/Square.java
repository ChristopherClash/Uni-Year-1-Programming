import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Square is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the square's bounding rectangle.
 */
public class Square extends ClosedShape {
    // the side of the square
    private int side;

    /**
     * Creates a square
     * @param x the display component's x position
     * @param y the display component's y position
     * @param vx the display component's x velocity
     * @param vy
     * @param side
     * @param color
     * @param isFilled
     */
    public Square(int insertionTime, int x, int y, int vx, int vy,
                  int side, Color color,boolean isFilled){
        super(insertionTime,x,y,vx,vy, color, isFilled);
        this.side = side;
    }

    /**
     *
     * @param side resets the side
     */
    public void setSide(int side){
        this.side = side;
    }

    /**
     *
     * @return The side of the square
     */
    public int getSide(){
        return side;
    }

    /**
     *
     * @return the width of the square
     */
    public int getWidth() {
        return side;
    }

    /**
     *
     * @return the height of the square
     */
    public int getHeight() {
        return side;
    }

    /**
     * A method to convert a square to a string
     * @return result
     */
    public String toString(){
        String result = "This is a square\n";
        result += super.toString();
        result += "Its side is " + this.side + "\n";
        return result;
    }

    /**
     * Draw a square on the screen
     * @param g The graphics object associated with the drawing component.
     */
    public void draw(GraphicsContext g) {
        g.setFill(colour);
        g.setStroke(colour);
        if (isFilled){
            g.fillRect(x,y,side,side);
        }
        else {
            g.strokeRect(x,y,side,side);
        }
    }
}
