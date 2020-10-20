package Widgets;

import Attributes.RadioItem.*;
import Base.*;
import lombok.Data;

@Data
public class RadioItem {
    private RadioItemGeneral general;
    private BasePresentation presentation;
    private RadioItemData data;
    private BaseConverter converter;
    private BaseListener listener;
    private BaseEvents events;
    private BaseValidation validation;
}
