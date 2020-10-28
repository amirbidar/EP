package Widgets;

import Attributes.Frame.events;
import Base.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Label {
     private String name;
     private String fullPath;
     private  String label;
     private String tooltip;
     private String enabled;
     private String layoutable;
     private String rendered;
     private String visible;
     private String value;

     @JacksonXmlProperty(localName = "layout-data")
     private LayoutData layoutData;

     private BaseListener listeners;

     private List<events> events=new ArrayList<>();
}
