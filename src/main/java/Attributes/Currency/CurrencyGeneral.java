package Attributes.Currency;

import Base.BaseGeneral;
import lombok.Data;

@Data
public class CurrencyGeneral extends BaseGeneral {
    private String label;
    private String ToolTip;
    private String defaultWidget;
}
