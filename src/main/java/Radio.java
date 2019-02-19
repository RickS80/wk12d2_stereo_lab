public class Radio extends Component {

    private String station;

    public Radio(String make, String model, String station) {
        super(make, model);
        this.station = station;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String playTune(){
        return "Playing " + this.station;
    }
}
