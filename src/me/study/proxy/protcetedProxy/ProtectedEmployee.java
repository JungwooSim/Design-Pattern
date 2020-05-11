package me.study.proxy.protcetedProxy;

public class ProtectedEmployee implements Employee {
    private Employee employee;

    public ProtectedEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return getName();
    }

    @Override
    public GRADE getGrade() {
        return getGrade();
    }

    @Override
    public String getInformation(Employee viewer) {
        if (viewer.getGrade() == employee.getGrade()) {
            return this.employee.getInformation(viewer);
        }

        switch (viewer.getGrade()) {
            case Manager :
                return this.employee.getInformation(viewer);
            default :
                return "NotAuthorized";
        }
    }
}
