import java.awt.*;

public class HeavyRect {

    private Color color;
    private int x, y, x2 ,y2;

    public HeavyRect(Color color, int upperX, int upperY, int lowerX, int lowerY) {
        this.color = color;
        this.x = upperX;
        this.y = upperY;
        this.x2 = lowerX;
        this.y2 = lowerY;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, x2, y2);
    }

}
