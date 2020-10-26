package Base;
import Enum.*;
import lombok.Data;

@Data
class NumberValidator {
    private EnumsDecleration.NumberValidatorEnvironment environment;
    private Integer minimumValue;
    private Integer maximumValue;
    private Boolean includeMinimumBoundry;
    private Boolean includeMaximumBoundry;
    private Boolean integer;
}
