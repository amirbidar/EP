package WidgetJson;

import Attributes.ListItem.ListItems;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StaticList {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public String validators;
    public String name;
    public ListItems items;
    @JsonProperty("selection-mode")
    public String selectionMode;
    public boolean enabled;
    public String events;
}
