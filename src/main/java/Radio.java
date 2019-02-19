public class Radio extends Component {

    private String station;

    public Radio(String station) {
        this.station = station;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String tune(){
        return "Play " + this.station;
    }
}
