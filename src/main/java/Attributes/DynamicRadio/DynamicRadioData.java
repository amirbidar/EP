package Attributes.DynamicRadio;

import Base.BaseData;
import lombok.Data;

@Data
public class DynamicRadioData extends BaseData {
    private String variable;
    private String itemValue;
    private String condition;
}
