package WidgetJson;

import Attributes.Composite.Border;
import Attributes.EditableTable.CellEditorComponents.Layout;
import Base.Children;
import Base.EventAll;
import Base.LayoutData;
import Base.Listeners;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Composite {
    public Layout layout;
    public Border border;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Children children;
    public Boolean layoutable;
    public String name;
    public String label;
    public Boolean enabled;
    public EventAll events;
}
