package Widgets;

import Attributes.Link.EventLink;
import Attributes.Link.GeneralLink;
import Base.BaseLayoutData;
import Base.BaseListener;
import Base.BasePresentation;
import lombok.Data;

@Data
public class Link {

    private GeneralLink general;
    private BaseLayoutData data;
    private BasePresentation presentation;
    private String Href;
    private BaseListener listener;
    private EventLink events;


}
