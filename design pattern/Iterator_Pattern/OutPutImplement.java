package Iterator_Pattern;

import java.util.Iterator;
import java.util.List;

public class OutPutImplement {
    List<College> collegeList;

    public OutPutImplement(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();

        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println(college.getName());
            System.out.println(college.createIterator());
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
        }
    }

    public void printDepartment(Iterator iterator)
    {
        while (iterator.hasNext())
        {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
