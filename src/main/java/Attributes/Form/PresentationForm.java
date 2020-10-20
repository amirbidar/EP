package Attributes.Form;

import Base.BasePresentation;
import lombok.Data;

@Data
public class PresentationForm extends BasePresentation {
    private Integer xPosition;
    private Integer yPosition;
    private Integer height;
    private Integer width;
}
