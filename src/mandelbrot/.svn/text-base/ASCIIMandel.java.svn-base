package mandelbrot;

import java.awt.Font;

public class ASCIIMandel {

    char[] CHARS;
    double MINI;
    double MAXI;
    double MINR;
    double MAXR;
    double PRECI;
    double PRECR;
    int ITERATIONS;
    int BUCKET;
    int XCOLS;
    int YROWS;
    int[][] PIXELMAP;
    Font FONT;

    public ASCIIMandel(){
        char[] c = new char[]{'#','$','&','/','|','[',']','+',';',':','-','.',' '};
        Font f = new Font("Consolas", Font.PLAIN, 12);
        updateVariables(c, -1.5, 0.1, -3.5, 0.05, 130, 33, 12, 1, f);
    }
    
    public final void updateVariables(char[] chars, double mini, double preci, 
            double minr, double precr, int xcols, int yrows, int iter, int bucket, Font font){
        // MAXR and MAXI not set : set the number of rows / column instead

        this.CHARS = chars;
        this.MINI = mini;
        this.PRECI = preci;
        this.MINR = minr;
        this.PRECR = precr;
        this.XCOLS = xcols;
        this.YROWS = yrows;
        this.ITERATIONS = iter;
        this.BUCKET = bucket;
        this.FONT = font;
    }
    
    public void draw() {
        // Create lines of symbols by stepping through the graph range
        PIXELMAP = new int[XCOLS][YROWS];
        
        double im, re;
        for (int i = 0; i < YROWS; i++) {
            im = MINI + i * PRECI;
            
            for (int r = 0; r < XCOLS; r++) {
                re = MINR + r * PRECR;
                
                int iter = getIterations(re, im, ITERATIONS, BUCKET);
                PIXELMAP[r][i] = iter;
            }
        }
    }
 
    static int getIterations(double CR, double CI, int ITER, int BUCKET) {
        // Iteration is Z -> Z^2 + C
        // Here, Re(C) = cr, Im(C) = ci
        // Z starts at 0, and Re(Z) = zr, Im(Z) = zi
        // Returns number of iterations up to 12 where mag(Z) <= 2
        int count = 0;
        boolean overTwo = false;
        double zr = 0;
        double zi = 0;

        for (int j = 0; !overTwo && j < ITER; j++) {
            
            double zrnew = (zr * zr) - (zi * zi) + CR;
            double zinew = 2 * zr * zi + CI;
            zr = zrnew;
            zi = zinew;

            if (mag(zr, zi) > 2) overTwo = true;
            
            else count++;
        }
        if(!overTwo) return 12;
        else return count / BUCKET % 12;
    }

    static double mag(double r, double i) {
        // Returns magnitude of the complex number
        return Math.sqrt(r * r + i * i);
    }
}
