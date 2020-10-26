package Widgets;

import Attributes.Form.EventPopup;
import Attributes.StaticComboBox.EventComboBox;
import Attributes.StaticComboBox.ItemsComboBox;
import Attributes.StaticComboBox.PresentationComboBox;
import Attributes.StaticComboBox.eventsComboBox;
import Base.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Data
public class ComboBox {
    private String value;
    private Boolean editable;
    private String Tooltip;
    private String Name;
    private String enabled;
    private String layoutable;
    private String label;
    @JacksonXmlProperty(localName = "layout-data")
    private BaseLayoutData layoutData;
    private ItemsComboBox items;
    private List<eventsComboBox> events=new ArrayList<>();
    private BaseConverter converter;
    private List<BaseListener> listeners=new ArrayList<>();
    private List<Validations> validators =new ArrayList<>();




}
