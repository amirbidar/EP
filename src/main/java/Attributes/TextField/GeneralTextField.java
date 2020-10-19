package Attributes.TextField;

import Base.BaseGeneral;
import Base.BaseGeneral_StaticWidgets;
import lombok.Data;

@Data
public class GeneralTextField extends BaseGeneral_StaticWidgets {
    private String  direction;
    private Boolean formatNumber;
    private Boolean defaultWidget;
}
