package Attributes.EditableTable.CellEditorComponents;

import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import Base.Listeners;
import lombok.Data;

@Data
public class CheckBoxEditableTable {
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    public String name;
    public String label;
    public String value;
    public boolean selected;
    public boolean enabled;
    public EventAll events;
}
