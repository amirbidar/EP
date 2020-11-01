package WidgetJson;

import Attributes.TabFolder.Tabs;
import Base.EventAll;
import Base.LayoutData;
import Base.Listeners;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TabFolder {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public String name;
    public Tabs tabs;
    public String label;
    public Boolean enabled;
    public EventAll events;
}
