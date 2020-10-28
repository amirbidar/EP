package Attributes.EditableTable;

import lombok.Data;

import java.util.List;
@Data
public class EntityEditableGrid {

    public Boolean editable;
    public String name;
    public List<PropertyEditableGrid> property;
    public Integer id;
    public String label;
    public String value;
}
