package Widgets;

import Attributes.DatePicker.EventDatePicker;
import Attributes.DynamicCheckbox.*;
import Attributes.StaticComboBox.EventComboBox;
import Base.*;
import lombok.Data;

@Data
public class DynamicCheckbox {
    private DynamicCheckboxGeneral general;
    private DynamicCheckboxLayout layout;
    private DynamicCheckboxPresentation presentation;
    private DynamicCheckBoxItemFinder itemFinder;
    private BaseConverter converter;
    private BaseListener listener;
    private EventComboBox event;
    private BaseValidation validation;
}
