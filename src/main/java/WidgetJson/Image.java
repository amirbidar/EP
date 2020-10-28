package WidgetJson;

import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Image {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Boolean layoutable;
    public String tooltip;
    public String name;
    public String label;
    public Boolean url;
    public Boolean enabled;
    public EventAll events;

}
