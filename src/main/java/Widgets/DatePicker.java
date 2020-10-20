package Widgets;

import Attributes.DatePicker.DataDatePicker;
import Attributes.DatePicker.EventDatePicker;
import Attributes.DatePicker.PresentationDatePicker;
import Base.*;
import lombok.Data;

@Data
public class DatePicker {
    private BaseGeneral_StaticWidgets general;
    private BaseLayoutData layoutData;
    private PresentationDatePicker presentation;
    private DataDatePicker data;
    private BaseConverter converter;
    private BaseListener listener;
    private EventDatePicker events;
    private BaseValidation validation;

}
