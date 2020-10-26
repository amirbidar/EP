package Base;
import Enum.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Validations {

    @JacksonXmlProperty(localName = "run-at")
    private EnumsDecleration.NumberValidatorEnvironment environment;
    @JacksonXmlProperty(localName = "client-side-language")
    private EnumsDecleration.Language language;
    private EnumsDecleration.EventPhase phase;
    @JacksonXmlProperty(localName = "error-message")
    private String errorMessage;
    private String script;

    @JacksonXmlProperty(localName = "minimum-value")
    private Integer minimumValue;
    @JacksonXmlProperty(localName = "maximum-value")
    private Integer maximumValue;
    @JacksonXmlProperty(localName = "include-minimum-boundry")
    private Boolean includeMinimumBoundry;
    @JacksonXmlProperty(localName = "include-maximum-boundry")
    private Boolean includeMaximumBoundry;

    private Boolean integer;
    @JacksonXmlProperty(localName = "regular-expression")
    private String regularExpression;
    @JacksonXmlProperty(localName = "regular-expression-error-message")
    private String errorMessageRegularExpression;
    @JacksonXmlProperty(localName = "minimum-length")
    private Integer minimumLength;
    @JacksonXmlProperty(localName = "maximum-length")
    private Integer maximumLength;


   /* @JacksonXmlProperty(localName = "script-validator")
    private ScriptValidator scriptvalidator;*/
    /*@JacksonXmlProperty(localName = "required-validator")
    private RequiredValidator requiredvalidator;*/
   /* @JacksonXmlProperty(localName = "number-validator")
    private NumberValidator numbervalidator;*/
/*    @JacksonXmlProperty(localName = "string-validator")
    private StringValidator stringvalidator;*/
   /* @JacksonXmlProperty(localName = "email-validator")
    private EmailValidator emailvalidator;*/
}
