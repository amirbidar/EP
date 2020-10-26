package Attributes.EditableColumn;

import Base.BaseData;
import lombok.Data;
import Enum.*;

@Data
public class DataEditableColumn extends BaseData {
    private EnumsDecleration.ColumnType type;
}
