package pl.samouczekprogramisty.kursjava;


public class Engine {

    private boolean started;
    private Cogwheel cogwheel;

    public Engine() {
        cogwheel = new Cogwheel(4);
        started = true;
    }
    public Engine(Cogwheel cogwheel) {
        this.cogwheel = cogwheel;
    }

    public void start() {
        started = initiateStartingSequence();
    }
    private boolean initiateStartingSequence() {
        return true;
    }
    public void stop() {
        started = false;
    }
    public boolean isStarted() {
        return started;
    }

    public int getCogwheel() {
        return cogwheel.getSize();
    }

    public void setStarted(boolean started) {
        this.started = started;


    }

}
