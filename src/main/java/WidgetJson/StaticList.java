package WidgetJson;

import Attributes.CheckBoxGroup.ItemCheckBoxGroup;
import Attributes.DynamicComboBox.ItemsComboBox;
import Attributes.EditableTable.CellEditorComponents.Items;
import Attributes.Label.Listeners;
import Base.BaseValidation;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StaticList {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public String name;
    public String label;
    public String value;
    public ItemCheckBoxGroup items;
    @JsonProperty("selection-mode")
    public String selectionMode;
    public Boolean enabled;
    public EventAll events;
}
