package Widgets;

import Attributes.ListItem.*;
import Attributes.RadioItem.RadioItemData;
import Base.BaseConverter;
import lombok.Data;

@Data
public class ListItem {
    private ListItemGeneral general;
    private ListItemPresentation presentation;
    private RadioItemData data;
    private BaseConverter converter;
}
