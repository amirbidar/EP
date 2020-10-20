package Widgets;

import Attributes.Link.EventLink;
import Base.*;
import lombok.Data;

@Data
public class Label {
     private BaseGeneral_StaticWidgets genral;

     private BaseLayoutData layoutData;

     private BasePresentation presentation;

     private BaseData data;

     private BaseListener listener;

     private EventLink events;
}
