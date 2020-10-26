package Attributes.StaticComboBox;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public class ItemsComboBox {
    private String value;
    private String var;
    private String condition;
    @JacksonXmlProperty(localName = "empty-item-label")
    private String emptyItemLabel;
    List<Props> item;
}
