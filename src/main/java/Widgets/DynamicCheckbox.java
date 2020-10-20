package Widgets;

import Attributes.DatePicker.EventDatePicker;
import Attributes.DynamicCheckbox.*;
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
    private EventDatePicker event;
    private BaseValidation validation;
}
