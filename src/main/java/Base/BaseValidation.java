package Base;

import lombok.Data;

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
        private Enum.Enums.NumberValidatorEnvironment environment;
        private Enum.Enums.Language language;
        private Enum.Enums.EventPhase phase;
        private String errorMessage;
        private String script;
    }
    @Data
    class RequiredValidator{
        private Enum.Enums.NumberValidatorEnvironment environment;
    }
    @Data
    class NumberValidator{
        private Enum.Enums.NumberValidatorEnvironment environment;
        private Integer minimumValue;
        private Integer maximumValue;
        private Boolean includeMinimumBoundry;
        private Boolean includeMaximumBoundry;
        private Boolean integer;
    }
    @Data
    class StringValidator{
        private Enum.Enums.NumberValidatorEnvironment environment;
        private String regularExpression;
        private String errorMessageRegularExpression;
        private Integer minimumLength;
        private Integer maximumLength;

    }
    @Data
    class EmailValidator{
        private Enum.Enums.NumberValidatorEnvironment environment;
    }

}
