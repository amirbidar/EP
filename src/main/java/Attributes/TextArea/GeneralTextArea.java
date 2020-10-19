package Attributes.TextArea;

import Base.BaseGeneral;
import Base.BaseGeneral_StaticWidgets;
import lombok.Data;

@Data
public class GeneralTextArea extends BaseGeneral_StaticWidgets {
    private String  direction;
    private Boolean enableHtml;
    private Boolean defaultWidget;
}
