public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(60, 90, 20, 30);
        Rectangle box2 = new Rectangle(box.getX() + box.getHeight(), box.getY() + box.getWidth(), box.getWidth(), box.getHeight());
        
        box.draw();
        box.translate(200, 100);
        System.out.println(box.getX());
        box2.draw();
    }
}
