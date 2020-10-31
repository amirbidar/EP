package Attributes.StaticList;

import Base.BaseConverter;
import lombok.Data;

@Data
public class ItemStaticList {
    public BaseConverter converter;
    public String name;
    public String icon;
    public String label;
    public String value;
}
