package Attributes.EditableTable.CellEditorComponents;

import Base.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RadioEditableTable {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public Listeners listeners;
    public Boolean layoutable;
    public BaseValidation validators;
    public BaseConverter converter;
    public String name;
    public Boolean label;
    public String value;
    public Boolean enabled;
    public EventAll events;
}
