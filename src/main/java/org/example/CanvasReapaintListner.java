package org.example;

import java.awt.*;

public interface CanvasReapaintListner {
    void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime);
}