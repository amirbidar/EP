package Attributes.EditableTable.CellEditorComponents;

import Base.BaseValidation;
import Base.EventAll;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PasswordFieldEditableTabel {
    public Boolean readonly;
    public Boolean layoutable;
    public BaseValidation validators;
    public String tooltip;
    public String name;
    @JsonProperty("max-length")
    public Integer maxLength;
    @JsonProperty("default-widget")
    public boolean defaultWidget;
    public String label;
    public String value;
    public Boolean enabled;
    public EventAll events;
}
