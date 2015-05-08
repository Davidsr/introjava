
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private String friends;

    /**
     * Constructor for objects of class Person
     */
    public Person(String aName)
    {
        // initialise instance variables
        this.name = aName;
        this.friends = "";
    }

    /**
     * Produce the person's name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Add a friend to friends
     * 
     * @param  friend Persona friend to add
     */
    public void addFriend( Person friend)
    {
        // put your code here
        this.friends = this.friends + friend + " ";
    }
    
    public void unfriend(Person nonFriend){
        this.friends.replace(" " + nonFriend.getName(), "");
    }
    
    public String getFriends(){
        return this.friends;
    }
}
