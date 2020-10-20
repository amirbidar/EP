package Attributes.CheckboxItem;

import Attributes.RadioItem.RadioItemData;
import lombok.Data;

@Data
public class CheckboxItemData extends RadioItemData {
    private String selected;
}
