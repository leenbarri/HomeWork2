import java.util.ArrayList;
import java.util.List;
public class Users {
    private int id  ;
    private int age;
    private int totalNumOfHours;
    private String name;
    private double hourlyRate;
    public Users(int id, int age, int totalNumOfHours ,String name, double hourlyRate) {
        this.id = id;
        this.age = age;
        this.totalNumOfHours = totalNumOfHours;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getTotalNumOfHours() {
        return totalNumOfHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public double budget() {
        return totalNumOfHours*hourlyRate;
    }
    public double getBudget(){
        return  budget();
    }

    public void add(Users user) {
        user.add(user);
    }
}

