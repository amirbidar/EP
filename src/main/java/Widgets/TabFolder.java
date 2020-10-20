package Widgets;

import Attributes.ListItem.ListItemGeneral;
import Attributes.TabFolder.TabFolderSelectedTab;
import Base.BaseEvents;
import Base.BasePresentation;
import lombok.Data;

@Data
public class TabFolder {
    private ListItemGeneral general;
    private BasePresentation presentation;
    private BaseEvents events;
    private TabFolderSelectedTab selectedTab;
}
