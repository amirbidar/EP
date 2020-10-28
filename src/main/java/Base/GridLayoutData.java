package Base;
import Enum.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
class GridLayoutData {
    @JsonProperty("h-grab")
    public Boolean hGrab;
    @JsonProperty("col-span")
    public Integer colSpan;
    @JsonProperty("v-grab")
    public Boolean vGrab;
    @JsonProperty("row-span")
    public Integer rowSpan;
    @JsonProperty("v-alignment")
    public String vAlignment;
    @JsonProperty("h-alignment")
    public String hAlignment;

}
