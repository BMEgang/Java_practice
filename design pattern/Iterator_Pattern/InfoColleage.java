package Iterator_Pattern;

import sun.security.krb5.internal.crypto.Des;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoColleage implements College {
    List<Department> departmentList;

    public InfoColleage() {
        departmentList = new ArrayList<Department>();
        addDepartment("information safty","information safty");
        addDepartment("cyber safty","cyber safty");
        addDepartment("server","server");
    }

    @Override
    public String getName() {
        return "information College";
    }

    @Override
    public void addDepartment(String name, String Desc) {
        Department department = new Department(name, Desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
