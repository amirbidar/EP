package WidgetJson;

import Attributes.Table.DataTable;
import Attributes.Tree.Columns;
import Base.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Grid {
    public Listeners listeners;
    public DataTable data;
    public Boolean layoutable;
    public BaseValidation validators;
    public Columns columns;
    public String label;
    public Boolean enabled;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    @JsonProperty("pagination-bar")
    public BasePagination paginationBar;
    public String name;
    public String header;
    @JsonProperty("default-page-size")
    public Integer defaultPageSize;
    @JsonProperty("enable-sort")
    public Boolean enableSort;
    @JsonProperty("selection-mode")
    public String selectionMode;
    public EventAll events;
}
