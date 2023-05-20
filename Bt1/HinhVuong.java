package GenericBT.Bt1;

class HinhVuong implements IHinhHoc {
    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
}
