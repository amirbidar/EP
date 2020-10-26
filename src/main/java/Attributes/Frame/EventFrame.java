package Attributes.Frame;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;
@Data
public class EventFrame {
//    @JacksonXmlProperty(localName = "")
    List<events> events;

}
