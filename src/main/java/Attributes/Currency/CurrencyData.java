package Attributes.Currency;

import Base.BaseData;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class CurrencyData extends BaseData {
    private int renderer;
    private String main;
    private String rates;
}
