package LetsEatServer;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
    int age;
    String userId;
    String name;
    String gender;
    String bio;
    String[] location;
    int maxRange;
    
    public User(int age, String userId, String name, String gender, String bio, String[] location, int maxRange) {
    	this.age = age;
    	this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.bio = bio;
        this.location = location;
        this.maxRange = maxRange;
        
    }
    
}
