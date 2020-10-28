package Base;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
class EntityProperties {
    private String name;
    private String value;
    private BaseConverter converter;
   /* private String factory;
    @JacksonXmlProperty(localName = "to-value")
    private String toValue;
    @JacksonXmlProperty(localName = "to-object")
    private String toObject;
    @JacksonXmlProperty(localName = "avoid-null-values")
    private Boolean avoidNull;*/
}
