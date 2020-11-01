package Base.Validationss;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DateRangeValidator {
    @JsonProperty("maximum-value")
    public Integer maximumValue;
    @JsonProperty("minimum-value")
    public Integer minimumValue;
    @JsonProperty("run-at")
    public String runAt;

}
