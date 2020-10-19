package Widgets;

import Attributes.TextArea.DataTextArea;
import Attributes.TextArea.GeneralTextArea;
import Base.*;
import lombok.Data;

@Data
public class TextArea {
    private GeneralTextArea general;
    private BaseLayoutData layoutData;
    private BasePresentation presentation;
    private DataTextArea data;
    private BaseConverter converter;
    private BaseListener listener;
    private BaseEvents events;
    private BaseValidation validation;


}
