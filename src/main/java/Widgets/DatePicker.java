package Widgets;

import Attributes.DatePicker.*;
import Base.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DatePicker {
    private String mode;
    private String value;
    private Boolean readonly;
    private String tooltip;
    private String calendarMode;
    private String name;
    private Boolean enabled;
    private String label;
    private Boolean layoutable;
    @JacksonXmlProperty(localName = "layout-data")
    private LayoutData layoutData;

    private List<Validations> validators =new ArrayList<>();

    private BaseConverter converter;

    private List<BaseListener> listeners=new ArrayList<>();

    private List<eventsDatePicker> events =new ArrayList<>();


}
