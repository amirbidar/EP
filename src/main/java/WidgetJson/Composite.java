package WidgetJson;

import Attributes.Composite.Border;
import Attributes.Composite.Children;
import Attributes.EditableTable.CellEditorComponents.Layout;
import Attributes.Label.Listeners;
import Base.EventAll;
import Base.LayoutData;
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
