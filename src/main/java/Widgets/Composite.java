package Widgets;

import Attributes.Composite.PresentationComposite;
import Attributes.Form.HiddnControls;
import Attributes.Form.LayoutForm;
import Attributes.Frame.EventFrame;
import Base.BaseGeneral_StaticWidgets;
import Base.BaseLayoutData;
import Base.BaseListener;
import Base.FormChildren;
import lombok.Data;

import java.util.List;

@Data
public class Composite {
    private BaseGeneral_StaticWidgets general;
    private BaseLayoutData layoutData;
    private LayoutForm layout;
    private PresentationComposite presentation;
    private HiddnControls hiddnControls;
    private List<FormChildren> widgetOrder;
    private BaseListener Listener;
    private EventFrame event;

}
