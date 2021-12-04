package Visitor_Pattern;

public class Failure extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("man said: fail");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman said: fail");
    }
}
