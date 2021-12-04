package Iterator_Pattern;

import java.util.Iterator;

public class ComputerColleage implements College {
    Department[] departments;
    int numberofDepartment = 0;

    public ComputerColleage() {
        departments = new Department[5];
        addDepartment("Java major","Java major");
        addDepartment("php major","php major");
        addDepartment("big data major","big data major");

    }

    @Override
    public String getName() {
        return "computer college";
    }

    @Override
    public void addDepartment(String name, String Desc) {

        Department department = new Department(name, Desc);
        departments[numberofDepartment] = department;
        numberofDepartment += 1;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
