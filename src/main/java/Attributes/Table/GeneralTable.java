package Attributes.Table;

import Base.BaseGeneral;
import lombok.Data;

@Data
public class GeneralTable extends BaseGeneral {
    private String label;
    private Enum.Enums.TableSelectionMode selectionMode;
    private String header;
}
