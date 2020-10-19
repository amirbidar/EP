package Attributes.EditableTable;

import Base.BaseData;
import lombok.Data;

@Data
public class DataEditableTable extends BaseData {

    private String factory;
    private Integer maximumRows;
    private String findExpression;
    private String deleteExpression;

}
