package Base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LayoutData {
    @JsonProperty("grid-layout-data")
    public GridLayoutData gridLayoutData;
}
