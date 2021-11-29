package Prototype;

public class client {
    public static void main(String[] args) {
        sheep sheep = new sheep("Tom",1,"white");

        sheep sheep1 = (sheep) sheep.clone();
        sheep sheep2 = (sheep) sheep.clone();
        sheep sheep3 = (sheep) sheep.clone();
        sheep sheep4 = (sheep) sheep.clone();
        sheep sheep5 = (sheep) sheep.clone();
    }
}
