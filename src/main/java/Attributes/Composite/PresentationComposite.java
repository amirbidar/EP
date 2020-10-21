package Attributes.Composite;

import Base.BasePresentation;
import lombok.Data;

@Data
public class PresentationComposite extends BasePresentation {
    private String Collapsible;
    private Boolean Collapsed;
    private Boolean hasBorder;



}
