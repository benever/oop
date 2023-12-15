package adapter;

public class TotalLengthAdapter extends Length{

    private TotalLength totalLength;
    public TotalLengthAdapter(TotalLength totalLength){
        this.totalLength = totalLength;
    }

    @Override
    public int getKm() {
        return totalLength.getTotalLength()/1000;
    }

    @Override
    public int getM() {
        return totalLength.getTotalLength()%1000;
    }
}