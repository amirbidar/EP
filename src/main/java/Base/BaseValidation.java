package Base;

import Base.Validationss.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import Enum.*;
import java.util.List;
@Data
public class BaseValidation {
  //  List<Validations> validations;

    @JsonProperty("required-validator")
    public RequiredValidator requiredValidator;
    @JsonProperty("email-validator")
    public EmailValidator emailValidator;
    @JsonProperty("number-validator")
    public NumberValidator numberValidator;
    @JsonProperty("string-validator")
    public StringValidator stringValidator;
    @JsonProperty("script-validator")
    public ScriptValidator scriptValidator;

}
