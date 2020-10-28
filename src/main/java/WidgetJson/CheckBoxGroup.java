package WidgetJson;

import Attributes.EditableTable.CellEditorComponents.Layout;
import lombok.Data;

@Data
public class CheckBoxGroup {
    public Layout layout;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public String validators;
    public String name;
    public Items items;
    public boolean enabled;
    public String events;
}
