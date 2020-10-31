package WidgetJson;

import Attributes.EditableTable.CellEditorComponents.Layout;
import Attributes.Label.Listeners;
import Attributes.RadioGroup.ItemRadioGroup;
import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RadioGroup {

    public Layout layout;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String name;
    public String label;
    public String value;
    public ItemRadioGroup items;
    public Boolean enabled;
    public EventAll events;
}
