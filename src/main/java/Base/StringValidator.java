package Base;
import Enum.*;
import lombok.Data;

@Data
class StringValidator {
    private EnumsDecleration.NumberValidatorEnvironment environment;
    private String regularExpression;
    private String errorMessageRegularExpression;
    private Integer minimumLength;
    private Integer maximumLength;

}
