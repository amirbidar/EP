package WidgetJson;

import Attributes.Label.Listeners;
import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CheckBoxItem {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String name;
    public String label;
    public String value;
    public Boolean selected;
    public Boolean enabled;
    public EventAll events;


}
