package GenericBT.Bt2;

public class Main {
    public static void main(String[] args) {
        // Thử nghiệm lớp TinhToanSoThuc
        ITinhToan<Double> tinhToanSoThuc = new TinhToanSoThuc();
        Double sum = tinhToanSoThuc.cong(2.5, 3.7, 1.2);
        System.out.println("Tổng các số thực: " + sum);

        Double product = tinhToanSoThuc.nhan(2.0, 3.0, 4.0);
        System.out.println("Tích các số thực: " + product);

        // Thử nghiệm lớp TinhToanPhanSo
        ITinhToan<PhanSo> tinhToanPhanSo = new TinhToanPhanSo();
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(3, 4);
        PhanSo sumPS = tinhToanPhanSo.cong(ps1, ps2);
        System.out.println("Tổng các phân số: " + sumPS);

        PhanSo productPS = tinhToanPhanSo.nhan(ps1, ps2);
        System.out.println("Tích các phân số: " + productPS);
    }
}
