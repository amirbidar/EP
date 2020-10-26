package Base;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BaseLayoutData {
    @JacksonXmlProperty(localName = "grid-layout-data")
   private GridLayoutData gridLayoutData;
}
