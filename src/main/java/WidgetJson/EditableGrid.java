package WidgetJson;

import Attributes.EditableTable.ColumnEditableTable;
import Attributes.EditableTable.ColumnsEditableTable;
import Attributes.EditableTable.DataEditableTable;
import Attributes.Label.Listeners;
import Base.BaseConverter;
import Base.BaseValidation;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EditableGrid {
    public String factory;
    public Listeners listeners;
    public DataEditableTable data;
    @JsonProperty("delete-expression")
    public String deleteExpression;
    public Boolean layoutable;
    public String validators;
    public ColumnsEditableTable columns;
    public BaseConverter converter;
    @JsonProperty("find-expression")
    public String  findExpression;
    public String label;
    @JsonProperty("show-side-buttons")
    public Boolean showSideButtons;
    public Boolean enabled;
    @JsonProperty("show-add-button")
    public Boolean showAddButton;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    @JsonProperty("maximum-rows")
    public Integer maximumRows;
    @JsonProperty("show-delete-button")
    public Boolean showDeleteButton;
    public String name;
    public String value;
    @JsonProperty("selection-mode")
    public String selectionMode;
    public EventAll events;
}
