package Attributes.TextField;

import Base.BaseData;
import lombok.Data;

@Data
public class DataTextField extends BaseData {
private Integer maxLength;
private Boolean readOnly;
}
