package Attributes.EditableTable;

import Base.BaseData;
import lombok.Data;

@Data
public class DataEditableTable {
    public String condition;
    public String var;
    public String value;
    public EntityEditableGrid entity;

}
