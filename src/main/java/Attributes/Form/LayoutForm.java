package Attributes.Form;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class LayoutForm {
    @JacksonXmlProperty(localName = "grid-layout")
   private GridLayout gridLayout;

}
