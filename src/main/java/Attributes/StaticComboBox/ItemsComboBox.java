package Attributes.StaticComboBox;

import Base.BaseConverter;
import lombok.Data;

import java.util.List;

@Data
public class ItemsComboBox {
    private String itemValue;
    private String variable;
    private String condition;
    private String emptyItemLabel;
    List<Props> props;
   @Data
   class Props{
       private String name;
       private String label;
       private String value;
       private String icon;
       private BaseConverter converter;


   }
}
