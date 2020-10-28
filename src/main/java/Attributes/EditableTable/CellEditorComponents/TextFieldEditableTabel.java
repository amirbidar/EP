package Attributes.EditableTable.CellEditorComponents;

import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import Enum.*;

@Data
public class TextFieldEditableTabel {

    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String tooltip;
    @JsonProperty("max-length")
    public Integer maxLength;
    @JsonProperty("default-widget")
    public Boolean defaultWidget;
    public Boolean formatNumber;
    public String label;
    public Boolean enabled;
    public Boolean readonly;
    public String name;
    public String value;
    public EventAll events;
    public EnumsDecleration.Direction direction;
}
