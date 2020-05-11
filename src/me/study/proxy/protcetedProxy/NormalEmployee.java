package me.study.proxy.protcetedProxy;

public class NormalEmployee implements Employee {
    String name;
    GRADE grade;

    public NormalEmployee(String name, GRADE grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public GRADE getGrade() {
        return grade;
    }

    @Override
    public String getInformation(Employee employee) {
        return "Display "+ getGrade().name() + " '" + getName() + "' personnel information";
    }
}
