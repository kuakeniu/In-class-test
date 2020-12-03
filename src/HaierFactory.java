
public class HaierFactory extends TvFactory {
    @Override
    public Tv makeTv(){
        System.out.println("生产了一台海尔电视");
        return new HaierTv();
    }
}
