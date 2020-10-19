package Base;

import lombok.Data;

@Data
public class BaseLayoutData {
    private Integer horizontalSpan;
    private Integer verticalSpan;
    private Integer horizontalHint;
    private Integer verticalHint;
    private String horizontalAlign;
    private String verticalAlign;
    private Boolean horizontalGrab;
    private Boolean verticalGrab;

}
