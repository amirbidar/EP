package Attributes.Form;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GridLayout {
    @JsonProperty("number-of-columns")
    public Integer numberOfColumns;
    @JsonProperty("horizontal-spacing")
    public Integer horizontalSpacing;
    @JsonProperty("margin-height")
    public Integer marginHeight;
    @JsonProperty("vertical-spacing")
    public Integer verticalSpacing;
    @JsonProperty("margin-width")
    public Integer marginWidth;
}
