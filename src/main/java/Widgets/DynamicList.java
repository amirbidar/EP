package Widgets;

import Attributes.DynamicList.*;
import Attributes.StaticComboBox.EventComboBox;
import Base.*;
import lombok.Data;

@Data
public class DynamicList extends BaseData {
    private DynamicListGeneral general;
    private BasePresentation presentation;
    private DynamicListData data;
    private BaseConverter converter;
    private BaseListener listener;
    private EventComboBox events;
    private BaseValidation validation;
}
