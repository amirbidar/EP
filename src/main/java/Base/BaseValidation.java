package Base;

import Base.EventListeners.OnClick;
import Base.Validationss.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import Enum.*;
import java.util.List;
@Data

public class BaseValidation {
  //  List<Validations> validations;
    @JsonProperty("required-validator")
    public List<RequiredValidator> requiredValidator;
    @JsonProperty("email-validator")
    public List<EmailValidator> emailValidator;
    @JsonProperty("number-validator")
    public List<NumberValidator> numberValidator;
    @JsonProperty("string-validator")
    public List<StringValidator> stringValidator;
    @JsonProperty("script-validator")
    public List<ScriptValidator> scriptValidator;
    @JsonProperty("captcha-validator")
    public List<CaptchaValidator> captchaValidator;
    @JsonProperty("on-click")
    public List<OnClick> onClick;
    @JsonProperty("selection-validator")
    public List<SelectionValidation> selectionValidation;
}
