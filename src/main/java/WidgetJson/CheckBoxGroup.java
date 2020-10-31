package WidgetJson;

import Attributes.CheckBoxGroup.ItemCheckBoxGroup;
import Attributes.EditableTable.CellEditorComponents.Layout;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CheckBoxGroup {
    public Layout layout;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public String validators;
    public String name;
    public ItemCheckBoxGroup items;
    public Boolean enabled;
    public String events;
}
