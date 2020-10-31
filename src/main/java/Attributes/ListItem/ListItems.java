package Attributes.ListItem;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ListItems {
    public List<ListItem> item;
    public String condition;
    public String var;
    @JsonProperty("empty-item-label")
    public String emptyLabel;
    public String value;
}
