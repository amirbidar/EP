package Widgets;

import Attributes.DynamicCheckbox.*;
import Attributes.DynamicRadio.*;
import Base.BaseConverter;
import Base.BaseEvents;
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
    private BaseEvents events;
    private BaseValidation validation;
}
