package WidgetJson;

import Attributes.CheckBoxGroup.ItemCheckBoxGroup;
import Attributes.EditableTable.CellEditorComponents.Layout;
import Base.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CheckBoxGroup {
    public Layout layout;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public BaseValidation validators;
    public String name;
    public String label;
    public String value;
    public BaseConverter converter;
    public Boolean layoutable;
    public Listeners listeners;
    public ItemCheckBoxGroup items;
    public Boolean enabled;

    public EventAll events;
}
