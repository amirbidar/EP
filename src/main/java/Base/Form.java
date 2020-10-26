package Base;

import Attributes.Form.*;
import Attributes.Frame.EventFrame;
import lombok.Data;

import java.util.List;
@Data
public class Form {
    private LayoutForm layout;
    private GeneralForm general;
    private PresentationForm presentation;
    private HiddnControls hiddenControls;
    private BaseListener listener;
    private WidgetOrder widgetOrder;
    private PopupForm popup;
    private FormRefrences formRefrences;
    private EventFrame events;
    private BaseValidation validation;
    private List<FormChildren> formChildrenList;

}
