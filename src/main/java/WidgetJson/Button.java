package WidgetJson;

import Attributes.Label.Listeners;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Button {
    public Listeners listeners;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public EventAll events;
    public Boolean layoutable;
    public String tooltip;
    public String caption;
    @JsonProperty("icon-url")
    public String iconUrl;
    @JsonProperty("icon-height")
    public Integer iconHeight;
    public String label;
    public Boolean enabled;
    @JsonProperty("default-key")
    public Boolean defaultKey;
    public String name;
    public String action;
    @JsonProperty("icon-width")
    public Integer iconWidth;

}
