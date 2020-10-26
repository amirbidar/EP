package Widgets;

import Attributes.Frame.EventFrame;
import Attributes.Frame.events;
import Attributes.Link.EventLink;
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
     private BaseLayoutData layoutData;

     private BaseListener listeners;

     private List<events> events=new ArrayList<>();
}
