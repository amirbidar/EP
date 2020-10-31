package WidgetJson;

import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DynamicWidget {
    public String renderer;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Boolean layoutable;
    public String tooltip;
    public String name;
    public String label;
    public String properties;
    public Boolean enabled;
    public EventAll events;
}
