import java.awt.*;

public class FlyRect {

    private Color color;
    private int x, y, x2 ,y2;

    public FlyRect(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {
        g.setColor(color);
        g.fillRect(upperX, upperY, lowerX, lowerY);
    }

}
