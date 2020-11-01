package Base;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("v-hint")
    public Integer vHint;
    @JsonProperty("h-hint")
    public Integer hHint;
    @JsonProperty("v-alignment")
    public String vAlignment;
    @JsonProperty("h-alignment")
    public String hAlignment;

}
