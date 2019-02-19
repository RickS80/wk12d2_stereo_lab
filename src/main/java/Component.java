public abstract class Component {

    protected int volume;
    protected int bass;
    protected int treble;

    public Component(){
        this.volume = 10;
        this.bass = 10;
        this.treble = 10;
    }

    public int getVolume() {
        return volume;
    }

    public int getBass() {
        return bass;
    }

    public int getTreble() {
        return treble;
    }
}
