package Base;
import Enum.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
class ScriptValidator {
    @JacksonXmlProperty(localName = "run-at")
    private EnumsDecleration.NumberValidatorEnvironment environment;
   @JacksonXmlProperty(localName = "client-side-language")
    private EnumsDecleration.Language language;
    private EnumsDecleration.EventPhase phase;
    @JacksonXmlProperty(localName = "error-message")
    private String errorMessage;
    private String script;
}
