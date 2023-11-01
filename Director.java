import java.util.List;
import java.util.ArrayList;

public class Director extends Users {
    private List<Manager> managerList;

    public Director(int id, int age, int totalNumOfHours, String name, double hourlyRate) {
        super(id, age, totalNumOfHours, name, hourlyRate);
        managerList = new ArrayList<>();

    }
    public void addManger(Manager manger){
        managerList.add(manger);
    }
    public List<Manager> getManagerList() {
        return managerList;
    }

}
