package Widgets;

import Base.BaseEvents;
import Base.BaseGeneral_StaticWidgets;
import Base.BaseLayoutData;
import Base.BasePresentation;
import lombok.Data;

@Data
public class Image {
    private BaseGeneral_StaticWidgets general;
    private BaseLayoutData layoutData;
    private BasePresentation presentation;
    private String URL;
    private BaseEvents events;

}
