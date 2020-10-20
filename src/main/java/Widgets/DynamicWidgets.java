package Widgets;

import Attributes.DynamicWidget.*;
import Attributes.StaticComboBox.EventComboBox;
import Base.*;
import lombok.Data;

@Data
public class DynamicWidgets {
    private DynamicWidgetsGeneral general;
    private BasePresentation presentation;
    private DynamicWidgetsData data;
    private EventComboBox events;
}
