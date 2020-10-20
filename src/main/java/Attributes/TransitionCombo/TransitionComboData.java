package Attributes.TransitionCombo;

import Base.BaseItem;
import lombok.Data;

@Data
public class TransitionComboData extends BaseItem {
    private String condition;
    private String emptyItem;
    private String finder;
    private String variable;
    private String value;
}
