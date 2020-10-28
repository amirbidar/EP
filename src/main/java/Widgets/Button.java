package Widgets;

import Attributes.Button.EventButton;
import Attributes.Button.GeneralButton;
import Attributes.Button.PresentationButton;
import Base.LayoutData;
import Base.BaseListener;
import lombok.Data;

@Data
public class Button {
    private GeneralButton general;
    private LayoutData layoutData;
    private PresentationButton presentation;
    private BaseListener listener;
    private EventButton events;
}
