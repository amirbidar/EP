package Base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BaseConverter {
    private String factory;
    @JsonProperty("to-object")
    public String toObject;
    @JsonProperty("to-value")
    public String toValue;
    @JsonProperty("avoid-null-values")
    public boolean avoidNullValues;
}
