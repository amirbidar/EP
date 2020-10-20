package Base;

import lombok.Data;

@Data
public class BaseLayoutData {
    private Integer horizontalSpan;
    private Integer verticalSpan;
    private Integer horizontalHint;
    private Integer verticalHint;
    private Enum.Enums.ColumnAlignment horizontalAlign;
    private Enum.Enums.ColumnAlignment verticalAlign;
    private Boolean horizontalGrab;
    private Boolean verticalGrab;

}
