package Widgets;

import Attributes.DynamicComboBox.DynamicComboboxData;
import Attributes.DynamicComboBox.DynamicComboboxGeneral;
import Attributes.DynamicComboBox.DynamicComboboxPresentation;
import Base.BaseConverter;
import Base.BaseEvents;
import Base.BaseListener;
import Base.BaseValidation;
import lombok.Data;

@Data
public class DynamicCombobox {
    private DynamicComboboxGeneral general;
    private DynamicComboboxPresentation presentation;
    private DynamicComboboxData data;
    private BaseConverter converter;
    private BaseListener listener;
    private BaseEvents events;
    private BaseValidation validation;
}
