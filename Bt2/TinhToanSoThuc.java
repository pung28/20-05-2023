package GenericBT.Bt2;

public class TinhToanSoThuc implements ITinhToan<Double> {
    @Override
    public Double cong(Double... args) {
        Double sum = 0.0;
        for (Double num : args) {
            sum += num;
        }
        return sum;
    }

    @Override
    public Double tru(Double... args) {
        Double result = args[0];
        for (int i = 1; i < args.length; i++) {
            result -= args[i];
        }
        return result;
    }

    @Override
    public Double nhan(Double... args) {
        Double product = 1.0;
        for (Double num : args) {
            product *= num;
        }
        return product;
    }

    @Override
    public Double chia(Double... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Phải có ít nhất một số để chia");
        }

        Double result = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] == 0) {
                throw new IllegalArgumentException("Không thể chia cho 0");
            }
            result /= args[i];
        }
        return result;
    }
}

