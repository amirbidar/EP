package Attributes.EditableTable;

import Base.BaseConverter;
import lombok.Data;

@Data
public class PropertyEditableGrid {
    public BaseConverter converter;
    public String name;
    public String value;
}
