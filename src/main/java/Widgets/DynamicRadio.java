package Widgets;

import Attributes.DynamicCheckbox.*;
import Attributes.DynamicRadio.*;
import Attributes.StaticComboBox.EventComboBox;
import Base.BaseConverter;
import Base.BaseListener;
import Base.BaseValidation;
import lombok.Data;

@Data
public class DynamicRadio {
    private DynamicRadioGeneral general;
    private DynamicCheckboxLayout layout;
    private DynamicCheckboxPresentation presentation;
    private DynamicRadioData data;
    private DynamicRadioItemFinder itemFinder;
    private BaseConverter converter;
    private BaseListener listener;
    private EventComboBox events;
    private BaseValidation validation;
}
