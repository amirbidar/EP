package WidgetJson;

import Attributes.Label.Listeners;
import Attributes.Tree.Columns;
import Base.EventAll;
import Base.LayoutData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Tree {
    public Listeners listeners;
    public Boolean lazy;
    @JsonProperty("sort-by-query")
    public Boolean sortByQuery;
    public Boolean layoutable;
    public String validators;
    public Columns columns;
    public String datas;
    public String label;
    public Boolean enabled;
    @JsonProperty("layout-data")
    public LayoutData layoutData;
    @JsonProperty("auto-expand-level")
    public Integer autoExpandLevel;
    @JsonProperty("expand-all")
    public Boolean expandAll;
    public String name;
    @JsonProperty("header-text")
    public String headerText;
    @JsonProperty("selection-mode")
    public String selectionMode;
    public EventAll events;
}
