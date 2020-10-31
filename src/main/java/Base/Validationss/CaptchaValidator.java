package Base.Validationss;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CaptchaValidator {
    @JsonProperty("run-at")
    public String runAt;

}
