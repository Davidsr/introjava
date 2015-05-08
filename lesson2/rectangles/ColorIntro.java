
/**
 * Write a description of class ColorIntro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ColorIntro
{
   public static void main(String args[]){
       Rectangle box = new Rectangle(60, 90, 100, 30);
       box.draw();
       box.setColor(new Color(255, 0, 255 ));
       box.draw();
    }
}
