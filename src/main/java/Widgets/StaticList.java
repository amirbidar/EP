package Widgets;

import Attributes.Button.EventButton;
import Attributes.Frame.EventFrame;
import Attributes.StaticList.*;
import Base.*;
import lombok.Data;

import java.util.List;

@Data
public class StaticList {
    private StaticListGeneral general;
    private BasePresentation presentation;
    private StaticListData data;
    private BaseConverter converter;
    private BaseListener listener;
    private EventFrame events;
    private BaseValidation validation;
    List<ListItem> itemOrder;
}
