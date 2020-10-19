package Attributes.Button;

import Base.BasePresentation;
import lombok.Data;

@Data
public class PresentationButton extends BasePresentation {
    private String iconUrl;
    private Integer iconWidth;
    private Integer iconHeight;
}
