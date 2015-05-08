public class DaysAlivePrinter
{
    public static void main(String[] args)
    {
        Day birthDay = new Day(1984,11, 25);
        Day lastDay = new Day(2013, 9, 19);
        System.out.print("LastDay: ");
        System.out.println(lastDay.toString());
        int daysAlive = lastDay.daysFrom(birthDay);
        System.out.print("Days alive: ");
        System.out.println(daysAlive);
    }
}
