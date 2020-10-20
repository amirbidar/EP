package Widgets;

import Attributes.DynamicCheckbox.DynamicCheckboxLayout;
import Attributes.DynamicCheckbox.DynamicCheckboxPresentation;
import Attributes.RadioGroup.*;
import Base.*;
import lombok.Data;

@Data
public class RadioGroup {
    private RadioGroupGeneral general;
    private DynamicCheckboxLayout layout;
    private DynamicCheckboxPresentation presentation;
    private RadioGroupData data;
    private BaseConverter converter;
    private BaseListener listener;
    private BaseEvents events;
    private BaseValidation validation;
}
