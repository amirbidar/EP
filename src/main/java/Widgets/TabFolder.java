package Widgets;

import Attributes.Currency.EventCurrency;
import Attributes.ListItem.ListItemGeneral;
import Attributes.TabFolder.TabFolderSelectedTab;
import Base.BasePresentation;
import lombok.Data;

@Data
public class TabFolder {
    private ListItemGeneral general;
    private BasePresentation presentation;
    private EventCurrency events;
    private TabFolderSelectedTab selectedTab;
}
