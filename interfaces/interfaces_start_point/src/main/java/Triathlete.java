public class Triathlete extends Athlete implements ISwim, IRun, ICycle  {

    @Override
    public void run(int distance){
        this.distanceTravelled += distance;
    }

    @Override
    public void swim(int distance){
        this.distanceTravelled += distance;
    }

    @Override
    public void cycle(int distance){
        this.distanceTravelled += distance;
    }


}
