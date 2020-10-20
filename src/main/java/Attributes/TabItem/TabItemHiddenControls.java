package Attributes.TabItem;

import Base.*;
import lombok.Data;
@Data
public class TabItemHiddenControls {
    private String name;
    private String value;
    private BaseConverter converter;
    private BaseListener listener;
}

