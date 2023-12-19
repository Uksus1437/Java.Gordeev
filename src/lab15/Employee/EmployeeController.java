package lab15.Employee;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public double getEmployeeHourlyRate() {
        return model.getHourlyRate();
    }

    public void setEmployeeHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }

    public int getEmployeeHoursWorked() {
        return model.getHoursWorked();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.calculateSalary());
    }
}