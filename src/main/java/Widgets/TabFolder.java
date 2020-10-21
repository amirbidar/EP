package Widgets;

import Attributes.Currency.EventCurrency;
import Attributes.Frame.EventFrame;
import Attributes.ListItem.ListItemGeneral;
import Attributes.TabFolder.TabFolderSelectedTab;
import Base.BasePresentation;
import Base.FormChildren;
import lombok.Data;

import java.util.List;

@Data
public class TabFolder {
    private ListItemGeneral general;
    private BasePresentation presentation;
    private EventFrame events;
    private TabFolderSelectedTab selectedTab;
    private List<FormChildren> children;
}
