public class RecordDeck extends Component {

    private int speed;
    private String make;
    private String model;

    public RecordDeck(String make, String model, int speed){
        this.speed = speed;
        this.make = make;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String playRecord(String record){
        return "Playing " + record;
    }
}
