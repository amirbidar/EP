package Attributes.Column;

import lombok.Data;
import Enum.*;

@Data
public class DataColumn {
    private Boolean sortable;
    private EnumsDecleration.ColumnType type;
}
