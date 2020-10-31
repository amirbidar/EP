package Attributes.CheckBoxGroup;

import WidgetJson.CheckBoxItem;
import lombok.Data;

import java.util.List;

@Data
public class ItemCheckBoxGroup {

    public List<CheckBoxItem> checkbox;
    public String condition;
    public String var;
    public String value;
}
