package Attributes.EditableTable.CellEditorComponents;

import Attributes.Label.Listeners;
import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import lombok.Data;

@Data
public class CheckBoxGroupEditableTable {
    public Layout layout;
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String name;
    public String label;
    public String value;
    public Items items;
    public Boolean enabled;
    public EventAll events;
}
