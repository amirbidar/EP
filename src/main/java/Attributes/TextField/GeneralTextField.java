package Attributes.TextField;

import Base.BaseGeneral;
import Base.BaseGeneral_StaticWidgets;
import lombok.Data;
import Enum.*;

@Data
public class GeneralTextField extends BaseGeneral_StaticWidgets {
    private EnumsDecleration.Direction direction;
    private Boolean formatNumber;
    private Boolean defaultWidget;
}
