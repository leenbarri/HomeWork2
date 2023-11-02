import java.util.ArrayList;
import java.util.List;
public class Manager extends Users{
    public List<Staff> staffList;
    public Manager(int id, int age, int totalNumOfHours, String name, double hourlyRate) {
        super(id, age, totalNumOfHours, name, hourlyRate);
        staffList=new ArrayList<>();
    }
    public void addStaff(Staff staff){
        staffList.add(staff);
    }
    public List<Staff> getStaffList(){
        return staffList;
    }
}
