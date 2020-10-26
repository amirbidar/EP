package Base;

import lombok.Data;
import Enum.*;

@Data
public class BaseLayoutData {
   private GridLayoutData gridLayoutData;
@Data
   class GridLayoutData{
       private Integer horizontalSpan;
       private Integer verticalSpan;
       private Integer horizontalHint;
       private Integer verticalHint;
       private EnumsDecleration.ColumnAlignment horizontalAlign;
       private EnumsDecleration.ColumnAlignment verticalAlign;
       private Boolean horizontalGrab;
       private Boolean verticalGrab;
   }
}
