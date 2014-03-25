package ball;

import java.awt.*;

// DO NOT CHANGE
public interface Ball {
    int DEFAULT_RADIUS = 50;

    int radius();
    Point center();
    void update();
}
