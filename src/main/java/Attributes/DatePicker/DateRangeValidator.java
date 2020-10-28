package Attributes.DatePicker;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DateRangeValidator {
    @JsonProperty("maximum-value")
    public int maximumValue;
    @JsonProperty("minimum-value")
    public int minimumValue;
    @JsonProperty("run-at")
    public String runAt;
}
