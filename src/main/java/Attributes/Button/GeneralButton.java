package Attributes.Button;

import Base.BaseGeneral;
import Base.BaseGeneral_StaticWidgets;
import lombok.Data;

@Data
public class GeneralButton extends BaseGeneral_StaticWidgets {
    private String caption;
    private String action;
    private Boolean defaultKey;

}
