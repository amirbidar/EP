package WidgetJson;

import Base.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RadioItem {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String name;
    public String label;
    public String value;
    public Boolean enabled;
    public Boolean visible;
    public Boolean rendered;
    public EventAll events;
}
