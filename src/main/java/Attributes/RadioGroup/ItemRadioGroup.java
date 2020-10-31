package Attributes.RadioGroup;

import WidgetJson.RadioItem;
import lombok.Data;

import java.util.List;

@Data
public class ItemRadioGroup {
    public List<RadioItem> radio;
    public String condition;
    public String var;
    public String value;

}
