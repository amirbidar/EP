package Base;
import Enum.*;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
class GridLayoutData {
    @JacksonXmlProperty(localName = "row-span")
    private Integer horizontalSpan;
    @JacksonXmlProperty(localName = "col-span")
    private Integer verticalSpan;
    private Integer horizontalHint;
    private Integer verticalHint;
    @JacksonXmlProperty(localName = "h-alignment")
    private EnumsDecleration.ColumnAlignment horizontalAlign;
    @JacksonXmlProperty(localName = "v-alignment")
    private EnumsDecleration.ColumnAlignment verticalAlign;
    @JacksonXmlProperty(localName = "h-grab")
    private Boolean horizontalGrab;
    @JacksonXmlProperty(localName = "v-grab")
    private Boolean verticalGrab;
}
