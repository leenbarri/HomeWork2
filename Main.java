
import java.util.ArrayList;
import java.util.List;
public class Main {
    DB db=new DB();
    public static void main(String[] args) {
        Manager man1=new Manager(1,35,155,"Ahmad",35);
        Director dir1=new Director(11,32,180,"Maha",25);
        Staff stf1=new Staff(111,25,100,"jana",20);
        Manager man2 = new Manager(2,31, 152,"Ali",35.5);
        Director dir2=new Director(22,27,170,"Maha",25);
        Staff stf2=new Staff(222,24,130,"jana",20);
        DB.addUser(man1);
        man1.addStaff(stf1);
        DB.addUser(dir1);
        DB.addUser(man2);
        DB.addUser(dir2);
        DB.addUser(stf2);
        Report budgetR= new Report.BudgetReport();
        String budget = budgetR.generate(man1);
        System.out.println(budget);
        Report stf=new Report.StaffReport();
        String staff=stf.generate(stf2);
        System.out.println(staff);


    }
}