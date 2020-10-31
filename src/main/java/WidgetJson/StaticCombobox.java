package WidgetJson;

import Attributes.EditableTable.CellEditorComponents.Items;
import Attributes.Label.Listeners;
import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StaticCombobox {
    public Listeners listeners;
    public boolean editable;
    public boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public boolean enabled;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public String name;
    public String value;
    public Items items;
    public EventAll events;
}
