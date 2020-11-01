package WidgetJson;

import Base.EventAll;
import Base.LayoutData;
import Base.Listeners;
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
    public Boolean visible;
    @JsonProperty("icon-width")
    public Integer iconWidth;

}
