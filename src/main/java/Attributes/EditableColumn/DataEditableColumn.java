package Attributes.EditableColumn;

import Base.BaseData;
import lombok.Data;

@Data
public class DataEditableColumn extends BaseData {
    private Enum.Enums.ColumnType type;
}
