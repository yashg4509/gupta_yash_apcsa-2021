//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
   private int x, y, xSpeed, ySpeed, w, h;
   private Color color;

   public SpeedUpBall()
   {
      x = 0;
      y = 0;
      xSpeed = 0;
      ySpeed = 0; 
      w = 0;
      h = 0;
      color = null;

   }

   public SpeedUpBall(int x, int y)
   {
      x = x;
      y = y;
      xSpeed = 0;
      ySpeed = 0; 
      w = 0;
      h = 0;
      color = null;


   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {

      x = x;
      y = y;
      xSpeed = xSpd;
      ySpeed = ySpd; 
      w = 0;
      h = 0;

   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {

      x = x;
      y = y;
      xSpeed = xSpd;
      ySpeed = xSpd; 
      w = wid;
      h = ht;


   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

      x = x;
      y = y;
      xSpeed = xSpd;
      ySpeed = xSpd; 
      w = wid;
      h = ht;
      color = col;

   }

   public void setXSpeed( int xSpd )
   {

      xSpeed = xSpd;

   }

   public void setYSpeed( int ySpd )
   {

      ySpeed = ySpd;
   }
}

