package Attributes.StaticComboBox;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ItemsComboBox {
    public String condition;
    public List<Item> item;
    public String var;
    @JsonProperty("empty-item-label")
    public String emptyItemLabel;
    public String value;
}
