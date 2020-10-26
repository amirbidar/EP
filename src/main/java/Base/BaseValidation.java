package Base;

import lombok.Data;
import Enum.*;
import java.util.List;
@Data
public class BaseValidation {
    List<Validations> validations;

    @Data
    class Validations{
        private ScriptValidator   scriptvalidator;
        private RequiredValidator requiredvalidator;
        private NumberValidator   numbervalidator;
        private StringValidator   stringvalidator;
        private EmailValidator    emailvalidator;




    }
    @Data
    class ScriptValidator{
        private EnumsDecleration.NumberValidatorEnvironment environment;
        private EnumsDecleration.Language language;
        private EnumsDecleration.EventPhase phase;
        private String errorMessage;
        private String script;
    }
    @Data
    class RequiredValidator{
        private EnumsDecleration.NumberValidatorEnvironment environment;
    }
    @Data
    class NumberValidator{
        private EnumsDecleration.NumberValidatorEnvironment environment;
        private Integer minimumValue;
        private Integer maximumValue;
        private Boolean includeMinimumBoundry;
        private Boolean includeMaximumBoundry;
        private Boolean integer;
    }
    @Data
    class StringValidator{
        private EnumsDecleration.NumberValidatorEnvironment environment;
        private String regularExpression;
        private String errorMessageRegularExpression;
        private Integer minimumLength;
        private Integer maximumLength;

    }
    @Data
    class EmailValidator{
        private EnumsDecleration.NumberValidatorEnvironment environment;
    }

}
