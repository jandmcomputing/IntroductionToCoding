package InternationalTaxBands;

public class InternationalTaxBands {
    private String country;


    public InternationalTaxBands(String itbCountry) {
        country = itbCountry;
    }

    public TaxBand[] getTaxBands() {
        if (country == "UK") {
            TaxBand tb1 = new TaxBand(0, 10000, 0);
            TaxBand tb2 = new TaxBand(10000, 40000, 20);
            TaxBand tb3 = new TaxBand(40000, 9999999, 40);
            TaxBand[] taxBands = new TaxBand[] { tb1, tb2, tb3};
            return taxBands;
        } else if (country == "US") {
            TaxBand tb1 = new TaxBand(0, 9999999, 20);
            TaxBand[] taxBands = new TaxBand[] { tb1};
            return taxBands;
        } else
            return null;
    }
}

