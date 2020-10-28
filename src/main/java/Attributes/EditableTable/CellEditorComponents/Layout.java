package Attributes.EditableTable.CellEditorComponents;

import Attributes.Form.GridLayout;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Layout {
    @JsonProperty("grid-layout")
    public GridLayout gridLayout;
}
