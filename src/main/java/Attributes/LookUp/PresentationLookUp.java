package Attributes.LookUp;

import Base.BasePresentation;
import lombok.Data;

@Data
public class PresentationLookUp extends BasePresentation {
    private String textFieldReadOnly;
    private String popUpTitle;
    private Integer width;
    private Integer height;
}
