package Base;

import Base.EventListeners.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
@JsonIgnoreProperties
public class EventAll {
    @JsonProperty("on-load")
    public List<OnLoad> onLoad;
    @JsonProperty("on-select")
    public List<OnSelect> onSelect;
    @JsonProperty("on-change")
    public List<OnChange> onChange;
    @JsonProperty("on-deselect")
    public List<OnDeselect> onDeselect;
    @JsonProperty("on-focus-lost")
    public List<OnFocusLost> onFocusLost;
    @JsonProperty("on-edit")
    public List<OnEdit> onEdit;
    @JsonProperty("on-last")
    public List<OnLast> onLast;
    @JsonProperty("on-previous")
    public List<OnPrevious> onPrevious;
    @JsonProperty("on-search")
    public List<OnSearch> onSearch;
    @JsonProperty("on-next")
    public List<OnNext> onNext;
    @JsonProperty("on-first")
    public List<OnFirst> onFirst;
    @JsonProperty("on-refresh")
    public List<OnRefresh> onRefresh;
    @JsonProperty("on-selection-change")
    public List<OnSelectionChange> onSelectionChange;
    @JsonProperty("on-click")
    public List<OnClick> onClick;
    @JsonProperty("on-double-click")
    public List<OnDoubleClick> onDoubleClicks;
    @JsonProperty("on-row-action")
    public List<OnRowAction> onRowActions;

   /* @JsonProperty("on-load")
    public OnLoad onLoad2;
    @JsonProperty("on-select")
    public OnSelect onSelect2;
    @JsonProperty("on-change")
    public OnChange onChange2;
    @JsonProperty("on-deselect")
    public OnDeselect onDeselect2;
    @JsonProperty("on-focus-lost")
    public OnFocusLost onFocusLost2;
    @JsonProperty("on-edit")
    public OnEdit onEdit2;
    @JsonProperty("on-last")
    public OnLast onLast2;
    @JsonProperty("on-previous")
    public OnPrevious onPrevious2;
    @JsonProperty("on-search")
    public OnSearch onSearch2;
    @JsonProperty("on-next")
    public OnNext onNext2;
    @JsonProperty("on-first")
    public OnFirst onFirst2;
    @JsonProperty("on-refresh")
    public OnRefresh onRefresh2;
    @JsonProperty("on-selection-change")
    public OnSelectionChange onSelectionChange2;*/



}
