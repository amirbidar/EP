package Base;

import Base.EventListeners.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import Enum.*;
import java.util.List;
@Data
public class EventAll {
    @JsonProperty("on-load")
    public OnLoad onLoad;
    @JsonProperty("on-select")
    public OnSelect onSelect;
    @JsonProperty("on-change")
    public OnChange onChange;
    @JsonProperty("on-deselect")
    public OnDeselect onDeselect;
    @JsonProperty("on-focus-lost")
    public OnFocusLost onFocusLost;
    @JsonProperty("on-edit")
    public OnEdit onEdit;
    @JsonProperty("on-last")
    public OnLast onLast;
    @JsonProperty("on-previous")
    public OnPrevious onPrevious;
    @JsonProperty("on-search")
    public OnSearch onSearch;
    @JsonProperty("on-next")
    public OnNext onNext;
    @JsonProperty("on-first")
    public OnFirst onFirst;
    @JsonProperty("on-refresh")
    public OnRefresh onRefresh;
    @JsonProperty("on-selection-change")
    public OnSelectionChange onSelectionChange;
}
