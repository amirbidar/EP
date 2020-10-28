package Widgets;

import Attributes.Link.EventLink;
import Attributes.Link.GeneralLink;
import Base.LayoutData;
import Base.BaseListener;
import Base.BasePresentation;
import lombok.Data;

@Data
public class Link {

    private GeneralLink general;
    private LayoutData data;
    private BasePresentation presentation;
    private String Href;
    private BaseListener listener;
    private EventLink events;


}
