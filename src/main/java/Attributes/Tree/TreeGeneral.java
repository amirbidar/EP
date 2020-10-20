package Attributes.Tree;

import Base.BaseGeneral;
import lombok.Data;

@Data
public class TreeGeneral extends BaseGeneral {
    private String label;
    private String header;
    private Integer autoExpandLevel;
    private String selectionMode;
    private boolean lazy;
    private boolean expandAll;
    private boolean sortByQuery;
}
