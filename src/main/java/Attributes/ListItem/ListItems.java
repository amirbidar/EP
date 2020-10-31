package Attributes.ListItem;

import Base.BaseConverter;
import lombok.Data;

@Data
public class ListItems {
    public BaseConverter converter;
    public String name;
    public String icon;
    public String label;
    public String value;
}
