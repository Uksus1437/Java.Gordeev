package lab15.Employee;

public class MVCEmployeeDemo {
    public static void main(String[] args) {
        Employee model = new Employee();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.setEmployeeName("John");
        controller.setEmployeeHourlyRate(20);
        controller.setEmployeeHoursWorked(40);
        controller.updateView();
    }
}