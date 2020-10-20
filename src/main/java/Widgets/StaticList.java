package Widgets;

import Attributes.StaticList.*;
import Base.*;
import lombok.Data;

@Data
public class StaticList {
    private StaticListGeneral general;
    private BasePresentation presentation;
    private StaticListData data;
    private BaseConverter converter;
    private BaseListener listener;
    private BaseEvents events;
    private BaseValidation validation;
}
