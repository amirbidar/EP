package Widgets;

import Attributes.StaticComboBox.ItemsComboBox;
import Attributes.StaticComboBox.eventsComboBox;
import Base.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class dropdown {
    private String value;
    private Boolean editable;
    private String Tooltip;
    private String Name;
    private String enabled;
    private String layoutable;
    private String label;
    @JacksonXmlProperty(localName = "layout-data")
    private LayoutData layoutData;
    private ItemsComboBox items;
    private List<eventsComboBox> events=new ArrayList<>();
    private BaseConverter converter;
    private List<BaseListener> listeners=new ArrayList<>();
    private List<Validations> validators =new ArrayList<>();




}
