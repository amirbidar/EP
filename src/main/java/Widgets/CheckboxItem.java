package Widgets;

import Attributes.CheckboxItem.CheckboxItemData;
import Attributes.CheckboxItem.EventCheckBoxItem;
import Attributes.DynamicWidget.DynamicWidgetsGeneral;
import Base.*;
import lombok.Data;

@Data
public class CheckboxItem {
    private DynamicWidgetsGeneral general;
    private BasePresentation presentation;
    private CheckboxItemData data;
    private BaseConverter converter;
    private BaseListener listener;
    private EventCheckBoxItem events;
    private BaseValidation validation;
}
