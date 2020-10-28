package Attributes.EditableTable;

import Attributes.EditableTable.CellEditorComponents.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CellEditor {
    public TextFieldEditableTabel textfield;
    public TextAreaEditableTabel textarea;
    @JsonProperty("password-field")
    public PasswordFieldEditableTabel passwordField;
    public DatePickerEditableTabel datepicker;
    public DropDownEditableTable dropdown;
    @JsonProperty("checkbox-group")
    public CheckBoxGroupEditableTable checkboxGroup;
    public CheckBoxEditableTable checkbox;
    public RadioEditableTable radio;


}
