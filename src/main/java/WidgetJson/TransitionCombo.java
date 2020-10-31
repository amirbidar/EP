package WidgetJson;

import Attributes.Label.Listeners;
import Attributes.StaticComboBox.ItemsComboBox;
import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransitionCombo {
    public Listeners listeners;
    public Boolean editable;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public boolean enabled;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public String name;
    public String value;
    public ItemsComboBox items;
    public EventAll events;
}
