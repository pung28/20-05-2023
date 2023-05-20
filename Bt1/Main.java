package GenericBT.Bt1;

public class Main {
    public static void main(String[] args) {
        HinhVuong hinhVuong = new HinhVuong(5);
        HinhTron hinhTron = new HinhTron(10);

        Drawable.draw(hinhVuong);
        Drawable.draw(hinhTron);
    }
}
