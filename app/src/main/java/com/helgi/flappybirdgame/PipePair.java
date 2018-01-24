package com.helgi.flappybirdgame;

import android.graphics.Matrix;
import com.helgi.framework.Graphics; // Til a� geta b�i� til Graphics g
import com.helgi.framework.Game; // til a� geta s�tt f�llin eins og drawImage
import com.helgi.framework.Image;

import java.util.Random;
import com.helgi.framework.Screen;
import com.helgi.flappybirdgame.Bird;

public class PipePair {
	Graphics g;
	double res;
	double gameWidth;
	double gameHeight;
    public double X;
    public double Y;
    //public int deg;
    private Random r;
    private Matrix matrix;
    
  
    // (X,Y) er punkturinn sem mi�ja bilsins milli p�puparsins leynist
  
    public PipePair(Game game, Screen scr, double X/*, int deg*/) {
	    g = game.getGraphics();
	    gameWidth = scr.gameWidth;
	    gameHeight = scr.gameHeight;
	    res = scr.res;
        this.X = X;
        //this.deg = deg;
        r = new Random();
        Y = gameHeight/6.5+r.nextInt((int)(gameHeight/1.8)); // Handah�fskennd Y sta�setning p�pa
        matrix = new Matrix();
    }
  
    public void update(float deltaTime) {
    	if (X < -gameWidth*0.39) {
    		X = gameWidth*1.12;
    		Y = gameHeight/6.5+r.nextInt((int)(gameHeight/1.8)); // Handah�fskennd Y sta�setning p�pa
        }
        X -= 1.8*deltaTime;
    }
  
    public void draw() {
        //deprecated:
    	//g.drawImage(Assets.pipe, matrix, X-(res*145)/2.0, Y-gameHeight/1.29, 0, res, false);
    	//g.drawImage(Assets.pipe, matrix, X-(res*145)/2.0, Y+gameHeight/10.2, 180, res, false);
        g.drawImage(Assets.pipeRed, matrix, X-(res*145)/2.0, Y-gameHeight/1.29, 0, res, false);
        g.drawImage(Assets.pipeGreen, matrix, X-(res*145)/2.0, Y+gameHeight/10.2, 180, res, false);

    }
  
    public double getX() { return X; }
    public double getY() { return Y; }

}