package Base;

import lombok.Data;

@Data
public class BaseConverter {
    private String factory;
    private String toValue;
    private String toObject;
    private Boolean avoidNull;
}
