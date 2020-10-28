package WidgetJson;

import Base.BaseValidation;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Captcha {
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    public BaseValidation validators;
    public String name;
    public String label;
    public Boolean enabled;
}
