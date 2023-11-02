public interface Report {
    String generate(Users users);

    class StaffReport implements Report {
        @Override
        public String generate(Users users) {
            if (users instanceof Manager) {
                Manager manager = (Manager) users;
                StringBuilder report = new StringBuilder(" Staff List " + manager.getName() + ":\n");
                for (Staff staff : manager.getStaffList()) {
                    report.append(" Staff Id : ").append(staff.getId()).append("\n");
                    report.append("Age: ").append(staff.getAge()).append("\n");
                    report.append("Total Hours: ").append(staff.getTotalNumOfHours()).append("\n");
                    report.append("Name: ").append(staff.getName()).append("\n");
                    report.append("Hourly Rate: ").append(staff.getHourlyRate()).append("\n");
                }
                return report.toString();
            }
            return "Invalid";
        }
    }
    class BudgetReport implements Report {
        @Override
        public String generate(Users users) {
            if (users instanceof Manager || users instanceof Director) {
                return "Budget Report for " + users.getName() + users.getBudget();
            }
            return "Invalid ";
        }
    }

}

