package Attributes.TextArea;

import Base.BaseData;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

@Data
public class DataTextArea extends BaseData {
    private Integer maxLength;
    private Boolean readOnly;
}
