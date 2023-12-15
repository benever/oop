package adapter;

public class LengthAdapter extends TotalLength{
    private Length length;

    public LengthAdapter(Length length) {
        this.length = length;
    }

    @Override
    public int getTotalLength() {
        return length.getKm()*1000 + length.getM();
    }
}