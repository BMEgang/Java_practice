package Iterator_Pattern;

import java.util.Iterator;

public interface College {
    public String getName();
    public void addDepartment(String name, String Desc);
    public Iterator createIterator();
}
