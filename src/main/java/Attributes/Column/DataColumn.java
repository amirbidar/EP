package Attributes.Column;

import lombok.Data;

@Data
public class DataColumn {
    private Boolean sortable;
    private Enum.Enums.ColumnType type;
}
