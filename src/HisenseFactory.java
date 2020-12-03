public class HisenseFactory extends TvFactory{
    @Override
    public Tv makeTv(){
        System.out.println("生产了一台海信电视");
        return new HisenseTv();
    }
}
