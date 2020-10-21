package Widgets;

import Attributes.DynamicCheckbox.DynamicCheckboxLayout;
import Attributes.DynamicCheckbox.DynamicCheckboxPresentation;
import Attributes.RadioGroup.*;
import Base.*;
import lombok.Data;

import java.util.List;

@Data
public class RadioGroup {
    private RadioGroupGeneral general;
    private DynamicCheckboxLayout layout;
    private DynamicCheckboxPresentation presentation;
    private RadioGroupData data;
    private BaseConverter converter;
    private BaseListener listener;
    private EventRadioGroup events;
    private BaseValidation validation;
    List<RadioItem> children;

}
