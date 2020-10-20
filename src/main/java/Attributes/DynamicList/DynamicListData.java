package Attributes.DynamicList;

import Base.BaseData;
import lombok.Data;

@Data
public class DynamicListData extends BaseData {
    private String condition;
    private String selectionMode;
    private String variable;
}
