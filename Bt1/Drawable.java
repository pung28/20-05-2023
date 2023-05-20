package GenericBT.Bt1;

class Drawable {
    public static void draw(IHinhHoc hinhHoc) {
        if (hinhHoc instanceof HinhVuong) {
            HinhVuong hinhVuong = (HinhVuong) hinhHoc;
            System.out.println("Vẽ ra HinhVuong[cạnh = " + hinhVuong.getCanh() + "]");
        } else if (hinhHoc instanceof HinhTron) {
            HinhTron hinhTron = (HinhTron) hinhHoc;
            System.out.println("Vẽ ra HinhTron[r = " + hinhTron.getBanKinh() + "]");
        } else {
            System.out.println("Không thể vẽ hình này.");
        }
    }
}
