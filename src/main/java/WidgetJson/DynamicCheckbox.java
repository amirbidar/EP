package WidgetJson;

import Attributes.Label.Listeners;
import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DynamicCheckbox {
    public String visible;
    public Listeners listeners;
    public String layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public String enabled;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public String rendered;
    public String name;
    public String value;
    public String selected;
    public EventAll events;
}
