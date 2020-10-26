package Attributes.Link;

import Base.BaseGeneral;
import Base.BaseGeneral_StaticWidgets;
import lombok.Data;
import Enum.*;

@Data
public class GeneralLink extends BaseGeneral_StaticWidgets {
    private String text;
    private EnumsDecleration.TargetLink target;

}
