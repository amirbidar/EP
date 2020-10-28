package Attributes.LookUp;

import lombok.Data;

import java.util.List;
@Data
public class Entity {
    public boolean editable;
    public String name;
    public List<Property> property;
    public int id;
    public String label;
    public String value;
}

