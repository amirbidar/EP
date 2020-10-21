package Widgets;

import Attributes.Frame.EventFrame;
import Attributes.ListItem.ListItemPresentation;
import Attributes.TabItem.*;
import Base.BaseListener;
import lombok.Data;

@Data
public class TabItem {
    private TabItemGeneral general;
    private ListItemPresentation presentation;
    private TabItemHiddenControls hiddenControls;
    private BaseListener listener;
    private EventFrame event;
}
