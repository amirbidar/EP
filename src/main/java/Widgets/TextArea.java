package Widgets;

import Attributes.Currency.EventCurrency;
import Attributes.TextArea.DataTextArea;
import Attributes.TextArea.GeneralTextArea;
import Base.*;
import lombok.Data;

@Data
public class TextArea {
    private GeneralTextArea general;
    private LayoutData layoutData;
    private BasePresentation presentation;
    private DataTextArea data;
    private BaseConverter converter;
    private BaseListener listener;
    private EventCurrency events;
    private BaseValidation validation;


}
