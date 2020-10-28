package WidgetJson;

import Base.EventAll;
import Attributes.Label.Listeners;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Button {
    public Listeners listeners;
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
    @JsonProperty("layout-data")
    public String name;
    public String action;
    @JsonProperty("icon-width")
    public Integer iconWidth;

}
