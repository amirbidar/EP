package Widgets;

import Attributes.Link.EventLink;
import Base.BaseGeneral_StaticWidgets;
import Base.LayoutData;
import Base.BasePresentation;
import lombok.Data;

@Data
public class Image {
    private BaseGeneral_StaticWidgets general;
    private LayoutData layoutData;
    private BasePresentation presentation;
    private String URL;
    private EventLink events;

}
