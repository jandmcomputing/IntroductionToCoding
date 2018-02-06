package InternationalTaxBands;

public class TaxBand {
    double min;
    double max;
    int percent;

    public TaxBand(double tbMin, double tbMax, int tbPercent) {
        min = tbMin;
        max = tbMax;
        percent = tbPercent;
    }
}
