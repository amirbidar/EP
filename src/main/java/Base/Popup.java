package Base;

import Attributes.EditableTable.CellEditorComponents.Layout;
import lombok.Data;

@Data
public class Popup {

    public Layout layout;
    public Boolean visible;
    public Boolean rendered;
    public Boolean draggable;
    public Boolean resizable;
    public Children children;
    public Boolean layoutable;
    public String name;
    public String label;
    public String title;
    public Boolean enabled;
    public EventAll events;
    public Listeners listeners;
}
