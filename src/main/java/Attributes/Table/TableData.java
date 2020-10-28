package Attributes.Table;

import Base.BaseEntities;
import lombok.Data;

@Data
public class TableData {
    private String var;
    private String value;
    private String condition;
    private BaseEntities entity;

}
