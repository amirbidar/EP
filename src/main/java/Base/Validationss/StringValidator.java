package Base.Validationss;

import Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public
class StringValidator {
    @JsonProperty("run-at")
    private EnumsDecleration.NumberValidatorEnvironment environment;
    @JsonProperty("regular-expression")
    private String regularExpression;
    @JsonProperty("regular-expression-error-message")
    private String errorMessageRegularExpression;
    @JsonProperty("minimum-length")
    private String minimumLength;
    @JsonProperty("maximum-length")
    private String maximumLength;

}
