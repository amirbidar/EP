package Base;

import lombok.Data;

@Data
class Properties {
    private String name;
    private String value;
    private BaseConverter converter;
}
