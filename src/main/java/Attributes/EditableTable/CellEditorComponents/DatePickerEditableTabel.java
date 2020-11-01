package Attributes.EditableTable.CellEditorComponents;

import Attributes.DatePicker.DatePickerValidators;
import Base.BaseConverter;
import Base.EventAll;
import Base.Listeners;
import lombok.Data;

@Data
public class DatePickerEditableTabel {
    public Listeners listeners;
    public Boolean layoutable;
    public DatePickerValidators validators;
    public BaseConverter converter;
    public String tooltip;
    public String label;
    public Boolean enabled;
    public String mode;
    public Boolean readonly;
    public String calendarMode;
    public String name;
    public String value;
    public EventAll events;
}
