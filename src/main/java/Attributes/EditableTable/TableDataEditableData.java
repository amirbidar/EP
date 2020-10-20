package Attributes.EditableTable;

import Base.BaseConverter;
import lombok.Data;

import java.util.List;
@Data
public class TableDataEditableData {
    private String var;
    private String dataValue;
    private String condition;
    private String name;
    private String id;
    private String label;
    private String enitityValue;
    private String editable;
    List<Properties> properties;
    @Data
    class Properties{
        private String name;
        private String value;
        private BaseConverter converter;

    }


}
