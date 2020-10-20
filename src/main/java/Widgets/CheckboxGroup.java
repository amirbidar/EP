package Widgets;

import Attributes.DynamicCheckbox.DynamicCheckboxLayout;
import Attributes.DynamicCheckbox.DynamicCheckboxPresentation;
import Attributes.RadioGroup.RadioGroupData;
import Attributes.RadioGroup.RadioGroupGeneral;
import Base.BaseConverter;
import Base.BaseEvents;
import Base.BaseListener;
import Base.BaseValidation;
import lombok.Data;

@Data
public class CheckboxGroup {
    private RadioGroupGeneral general;
    private DynamicCheckboxLayout layout;
    private DynamicCheckboxPresentation presentation;
    private RadioGroupData data;
    private BaseConverter converter;
    private BaseListener listener;
    private BaseEvents events;
    private BaseValidation validation;
}
