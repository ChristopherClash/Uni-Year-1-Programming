import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * triangle is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the triangle's bounding rectangle.
 */
public class Triangle extends ClosedShape {
    // the width and height of a triangle
    private int width;
    private int height;

    /**
     * Creates a triangle
     * @param x the display component's x position
     * @param y the display component's y position
     * @param vx the display component's x velocity
     * @param vy the display component's y velocity
     * @param width the display component's width
     * @param height the display component's height
     * @param color the line or fill colour
     * @param isFilled True if the triangle is filled with colour, false if opaque
     */
    public Triangle(int insertionTime, int x, int y, int vx, int vy,
                  int width, int height, Color color, boolean isFilled){
        super(insertionTime, x, y, vx, vy, color, isFilled);
        this.width = width;
        this.height = height;
    }

    /**
     * @return width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Resets width
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return height
     */
    public int getHeight(){
        return height;
    }

    /**
     * resets height
     * @param height
     */
    public void setHeight(int height){
        this.height = height;
    }

    /**
     * @return the X-coordinates of the points a,b & c on the triangle
     */
    public double[] getXCoords(){
        double a = x;
        double b = x + width;
        double c = x +  width/2;
        return new double[]{a, b, c};
    }

    /**
     * @return the Y-coordinates of the points a,b & c on the triangle
     */
    public double[] getYCoords(){
        double a = y;
        double b = y;
        double c = y + height;
        return new double[]{a, b, c};
    }

    /**
     * A method to convert a triangle to a string
     */
    public String toString(){
        String result = "This is a triangle\n";
        result += super.toString();
        result += "Its width is " + width + " and its height is " + height;
        return result;
    }

    /**
     * Draw a triangle on the screen
     * @param g The graphics object associated with the drawing component.
     */
    public void draw(GraphicsContext g) {
        g.setFill(colour);
        g.setStroke(colour);
        if (isFilled){
            g.fillPolygon(getXCoords(), getYCoords(), 3);
        } else {
            g.strokePolygon(getXCoords(), getYCoords(), 3);
        }
    }
}
