import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rect extends ClosedShape{
    // rectangle's width and height
    private int width, height;

    /**
     * Creates a rectangle
     * @param x the display component's x coordinate
     * @param y the display component's y coordinate
     * @param vx the display component's x velocity
     * @param vy the display component's y velocity
     * @param width the width of the rectangle (in pixels)
     * @param height the height of the rectangle (in pixels)
     * @param color the line or fill colour
     * @param isFilled True if the rectangle is filled with colour, false if opaque
     */
    public Rect(int insertionTime, int x, int y, int vx, int vy, int width,
                int height, Color color, boolean isFilled){
        super(insertionTime,x,y,vx,vy,color,isFilled);
        this.height = height;
        this.width = width;
    }

    /**
     * @return The width of the rectangle
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return The height of the rectangle
     */
    public int getHeight() {
        return height;
    }

    /**
     * resets the height value
     * @param height
     */
    public void setHeight(int height){
        this.height = height;
    }

    /**
     * resets the width value
     * @param width
     */
    public void setWidth(int width){
        this.width = width;
    }

    /**
     * method to convert a rectangle to a string
     */
    public String toString(){
        String result = "This is a rectangle\n";
        result += super.toString();
        result += "Its width is " + this.width + " and its height is " + this.height + "\n";
        return result;
    }

    /**
     * Draw the rectangle on the screen
     * @param g The graphics object associated with the drawing component.
     */
    public void draw(GraphicsContext g) {
        g.setFill(colour);
        g.setStroke(colour);
        if (isFilled){
            g.fillRect(x,y,width,height);
        }
        else{
            g.strokeRect(x,y,width,height);
        }
    }
}
