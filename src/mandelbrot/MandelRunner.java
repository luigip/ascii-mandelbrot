package mandelbrot;

import myutil.Tools;

public class MandelRunner {

    public static void main(String[] args) {
//        Tools.setLookNimbus();
        Tools.setLookSystem();
        MandelPanel_DS mp = new MandelPanel_DS();
        Tools.framePanel(mp, "ASCII Mandelbrot");
    }
/*
     * TODO:
     * Determine correct X and Y precision to keep 1:1 aspect ratio
     * Font size selector
     * Improve palette
     * Zoom level indicator
     * Drag mouse to pan
     * Double click to zoom
     * Right-click and drag to select area and zoom
     * Animation
     * Re and Im ranges should update when size changed
     */
}
