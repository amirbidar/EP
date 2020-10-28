package Base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BasePagination {
    @JsonProperty("number-of-pages")
    public String numberOfPages;
    @JsonProperty("page-number")
    public String pageNumber;
    public String text;
}
