package Attributes.EditableTable;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ColumnEditableTable {
    @JsonProperty("cell-editor")
    public CellEditor cellEditor;
    public String name;
    public Integer width;
    public String header;
    public String alignment;
    public String type;
    public Boolean visible;
    public String color;
    public String icon;
}
