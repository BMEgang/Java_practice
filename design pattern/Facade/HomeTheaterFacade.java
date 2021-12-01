package Facade;

public class HomeTheaterFacade {
    private TheaterLight theaterLight;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Popcorn popcorn;
    private Screen screen;
    private Stereo stereo;

    public HomeTheaterFacade() {
        this.theaterLight = theaterLight.getInstance();
        this.dvdPlayer = dvdPlayer.getInstance();
        this.projector = projector.getInstance();
        this.popcorn = popcorn.getInstance();
        this.screen = screen.getInstance();
        this.stereo = stereo.getInstance();
    }

    public void Ready()
    {
        popcorn.on();
        popcorn.operate();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dark();
    }

    public void Play()
    {
        dvdPlayer.played();
    }

    public void stop()
    {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
