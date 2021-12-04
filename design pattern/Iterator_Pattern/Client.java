package Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<College>();

        ComputerColleage computerColleage = new ComputerColleage();
        InfoColleage infoColleage = new InfoColleage();

        collegeList.add(computerColleage);
        collegeList.add(infoColleage);

        OutPutImplement outPutImplement = new OutPutImplement(collegeList);
        outPutImplement.printCollege();
    }
}
