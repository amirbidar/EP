package Attributes.StaticComboBox;

import Base.BaseConverter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
class Props {
    private String name;
    private String label;
    private String value;
    private String icon;
    private String factory;
    @JacksonXmlProperty(localName = "to-value")
    private String toValue;
    @JacksonXmlProperty(localName = "to-object")
    private String toObject;
    @JacksonXmlProperty(localName = "avoid-null-values")
    private Boolean avoidNull;


}
