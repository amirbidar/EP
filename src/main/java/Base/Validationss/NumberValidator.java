package Base.Validationss;

import Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public
class NumberValidator {
    @JsonProperty("run-at")
    private EnumsDecleration.NumberValidatorEnvironment environment;
    @JsonProperty("minimum-value")
    private Integer minimumValue;
    @JsonProperty("maximum-value")
    private Integer maximumValue;
    @JsonProperty("include-minimum-boundry")
    private Boolean includeMinimumBoundry;
    @JsonProperty("include-maximum-boundry")
    private Boolean includeMaximumBoundry;
    private Boolean integer;
}
