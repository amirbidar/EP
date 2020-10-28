package Base.Validationss;
import Enum.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public
class RequiredValidator {
    @JsonProperty("run-at")
    private EnumsDecleration.NumberValidatorEnvironment environment;
}
