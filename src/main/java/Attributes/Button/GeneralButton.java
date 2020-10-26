package Attributes.Button;

import Base.BaseGeneral;
import Base.BaseGeneral_StaticWidgets;
import lombok.Data;
import  Enum.*;

@Data
public class GeneralButton extends BaseGeneral_StaticWidgets {
    private String caption;
    private EnumsDecleration.ButtonAction action;
    private Boolean defaultKey;
    private String readOnly;
    private String direction;
    private String formatNumber;
    private String enabled;

}
