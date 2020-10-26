package Attributes.TextArea;

import Base.BaseGeneral;
import Base.BaseGeneral_StaticWidgets;
import lombok.Data;
import Enum.*;

@Data
public class GeneralTextArea extends BaseGeneral_StaticWidgets {
    private EnumsDecleration.Direction direction;
    private Boolean enableHtml;
    private Boolean defaultWidget;
}
