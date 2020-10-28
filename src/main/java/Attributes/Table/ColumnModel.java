package Attributes.Table;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

@Data
public class ColumnModel {

    private String name;
    private String header;
    private Boolean sortable;
    private String alignment;
    private Integer width;
    private String type;
}
