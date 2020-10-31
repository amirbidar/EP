package WidgetJson;

import Attributes.Label.Listeners;
import Attributes.ListItem.ListItems;
import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StaticList {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public BaseValidation validators;
    public Listeners listeners;
    public String name;
    public ListItems items;
    @JsonProperty("selection-mode")
    public String selectionMode;
    public Boolean enabled;
    public EventAll events;
    public Boolean layoutable;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public String value;
}
