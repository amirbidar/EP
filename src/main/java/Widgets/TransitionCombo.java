package Widgets;

import Attributes.StaticComboBox.EventComboBox;
import Attributes.StaticList.StaticListGeneral;
import Attributes.TransitionCombo.*;
import Base.BaseConverter;
import Base.BaseListener;
import Base.BaseValidation;
import lombok.Data;

@Data
public class TransitionCombo {
    private StaticListGeneral general;
    private TransitionComboPresentation presentation;
    private TransitionComboData data;
    private BaseConverter converter;
    private BaseListener listener;
    private EventComboBox events;
    private BaseValidation validation;
}
