import java.awt.*;
import java.util.HashMap;

public class RectFactory {

    private static final HashMap<Color, FlyRect> rectsByColor = new HashMap<Color, FlyRect>();

    public static FlyRect getFlyRect(Color color) {

        FlyRect rect = (FlyRect) rectsByColor.get(color);

        if (rect == null) {             // if there is no rectangle,
            rect = new FlyRect(color);  // create one.

            rectsByColor.put(color, rect); // add this new rect profile to the HashMap.
        }
        return rect;
    }
}
