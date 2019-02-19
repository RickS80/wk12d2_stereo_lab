public class RecordDeck extends Component implements IPlay {

    private int speed;
    private String make;
    private String model;

    public RecordDeck(String make, String model, int speed){
        super(make, model);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String play(String record){
        return "Playing " + record;
    }
}
