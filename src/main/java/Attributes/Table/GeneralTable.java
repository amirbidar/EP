package Attributes.Table;

import Base.BaseGeneral;
import lombok.Data;
import Enum.*;

@Data
public class GeneralTable extends BaseGeneral {
    private String label;
    private EnumsDecleration.TableSelectionMode selectionMode;
    private String header;
}
