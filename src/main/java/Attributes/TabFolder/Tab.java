package Attributes.TabFolder;

import Attributes.EditableTable.CellEditorComponents.Layout;
import Attributes.Label.Listeners;
import Base.EventAll;
import lombok.Data;

@Data
public class Tab {
        public Layout layout;
        public Listeners listeners;
        public Boolean layoutable;
        public String tooltip;
        public String icon;
        public String name;
        public String label;
        public String title;
        public Boolean enabled;
        public EventAll events;
}
