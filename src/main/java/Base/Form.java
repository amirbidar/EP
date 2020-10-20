package Base;

import Attributes.Form.*;
import lombok.Data;

import java.util.List;
@Data
public class Form {
private GeneralForm general;
private LayoutForm layout;
private PresentationForm presentation;
private HiddnControls hiddenControls;
private WidgetOrder widgetOrder;
private BaseListener listener;
private BaseEvents events;
private PopupForm popup;
private FormRefrences formRefrences;
private BaseValidation validation;
private List<FormChildren> formChildrenList;

}
