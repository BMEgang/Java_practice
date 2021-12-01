package Facade;

public class client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.Ready();
        homeTheaterFacade.Play();
        homeTheaterFacade.stop();
    }
}
