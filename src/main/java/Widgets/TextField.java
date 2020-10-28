package Widgets;

import Attributes.Frame.events;
import Base.*;
import Enum.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TextField {
    private String name;
    private String fullpath;
    private Boolean enabled;
    private EnumsDecleration.Direction direction;
    private Boolean formatNumber;
    @JacksonXmlProperty(localName = "default-widget")
    private Boolean defaultWidget;
    private  String label;
    private String value;
    @JacksonXmlProperty(localName ="max-length")
    private Integer maxlength;
    private String tooltip;
    private Boolean readonly;
    private Boolean layoutable;
    @JacksonXmlProperty(localName = "layout-data")
    private LayoutData layoutData;

    private BaseConverter converter;

    private List<BaseListener> listeners=new ArrayList<>();

    private List<events> events =new ArrayList<>();

    private List<Validations> validators =new ArrayList<>();


}
