package GenericBT.Bt2;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    // Other methods of the PhanSo class

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}