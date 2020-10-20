package Attributes.Table;

import Base.BaseGeneral;
import lombok.Data;

@Data
public class GeneralTable extends BaseGeneral {
    private String label;
    private String selectionMode;
    private String header;
}
