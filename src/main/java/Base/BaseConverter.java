package Base;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BaseConverter {
    private String factory;
    @JacksonXmlProperty(localName = "to-value")
    private String toValue;
    @JacksonXmlProperty(localName = "to-object")
    private String toObject;
    @JacksonXmlProperty(localName = "avoid-null-values")
    private Boolean avoidNull;
}
