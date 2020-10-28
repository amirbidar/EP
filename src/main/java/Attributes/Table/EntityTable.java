package Attributes.Table;

import lombok.Data;

import java.util.List;

@Data
public class EntityTable {
    public Boolean editable;
    public String name;
    public List<PropertyTable> property;
    public Integer id;
    public String label;
    public Integer value;

}
