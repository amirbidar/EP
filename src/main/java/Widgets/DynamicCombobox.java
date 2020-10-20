package Widgets;

import Attributes.DynamicComboBox.DynamicComboboxData;
import Attributes.DynamicComboBox.DynamicComboboxGeneral;
import Attributes.DynamicComboBox.DynamicComboboxPresentation;
import Attributes.StaticComboBox.EventComboBox;
import Base.BaseConverter;
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
    private EventComboBox events;
    private BaseValidation validation;
}
