package Visitor_Pattern;

public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("man said: success");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman said: success");
    }
}
