package GenericBT.Bt2;

public class TinhToanPhanSo implements ITinhToan<PhanSo> {
    @Override
    public PhanSo cong(PhanSo... args) {
        PhanSo sum = new PhanSo(0, 1);
        for (PhanSo ps : args) {
            sum = congPhanSo(sum, ps);
        }
        return sum;
    }

    @Override
    public PhanSo tru(PhanSo... args) {
        PhanSo result = args[0];
        for (int i = 1; i < args.length; i++) {
            result = truPhanSo(result, args[i]);
        }
        return result;
    }

    @Override
    public PhanSo nhan(PhanSo... args) {
        PhanSo product = new PhanSo(1, 1);
        for (PhanSo ps : args) {
            product = nhanPhanSo(product, ps);
        }
        return product;
    }

    @Override
    public PhanSo chia(PhanSo... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Phải có ít nhất một phân số để chia");
        }

        PhanSo result = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i].getTuSo() == 0) {
                throw new IllegalArgumentException("Không thể chia cho phân số có tử số bằng 0");
            }
            result = chiaPhanSo(result, args[i]);
        }
        return result;
    }

    // Các phương thức hỗ trợ tính toán phân số

    private PhanSo congPhanSo(PhanSo ps1, PhanSo ps2) {
        int tuSo = ps1.getTuSo() * ps2.getMauSo() + ps2.getTuSo() * ps1.getMauSo();
        int mauSo = ps1.getMauSo() * ps2.getMauSo();
        return toiGianPhanSo(new PhanSo(tuSo, mauSo));
    }

    private PhanSo truPhanSo(PhanSo ps1, PhanSo ps2) {
        int tuSo = ps1.getTuSo() * ps2.getMauSo() - ps2.getTuSo() * ps1.getMauSo();
        int mauSo = ps1.getMauSo() * ps2.getMauSo();
        return toiGianPhanSo(new PhanSo(tuSo, mauSo));
    }

    private PhanSo nhanPhanSo(PhanSo ps1, PhanSo ps2) {
        int tuSo = ps1.getTuSo() * ps2.getTuSo();
        int mauSo = ps1.getMauSo() * ps2.getMauSo();
        return toiGianPhanSo(new PhanSo(tuSo, mauSo));
    }

    private PhanSo chiaPhanSo(PhanSo ps1, PhanSo ps2) {
        int tuSo = ps1.getTuSo() * ps2.getMauSo();
        int mauSo = ps1.getMauSo() * ps2.getTuSo();
        if (mauSo == 0) {
            throw new IllegalArgumentException("Không thể chia cho phân số có tử số bằng 0");
        }
        if (mauSo < 0) {
            tuSo *= -1;
            mauSo *= -1;
        }
        return toiGianPhanSo(new PhanSo(tuSo, mauSo));
    }

    private int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private PhanSo toiGianPhanSo(PhanSo ps) {
        int ucln = timUCLN(ps.getTuSo(), ps.getMauSo());
        int tuSo = ps.getTuSo() / ucln;
        int mauSo = ps.getMauSo() / ucln;
        return new PhanSo(tuSo, mauSo);
    }
}
