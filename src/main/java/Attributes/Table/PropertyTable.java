package Attributes.Table;

import Base.BaseConverter;
import lombok.Data;

@Data
public class PropertyTable {
    public BaseConverter converter;
    public String name;
    public String value;
}
