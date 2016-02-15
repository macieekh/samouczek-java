package pl.samouczekprogramisty.kursjava;



public class Main {
    public static void main(String[] args) {
        Engine silnik  = new Engine();
        Cogwheel cos = new Cogwheel(2);
        System.out.println(silnik.isStarted());
        System.out.println(cos.getSize());
        System.out.println(silnik.getCogwheel());
    }
}














