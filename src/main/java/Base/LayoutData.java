package Base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class LayoutData {
    @JsonProperty("grid-layout-data")
    public GridLayoutData gridLayoutData;
}
