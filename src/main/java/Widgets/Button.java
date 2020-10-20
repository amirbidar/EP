package Widgets;

import Attributes.Button.GeneralButton;
import Attributes.Button.PresentationButton;
import Base.BaseEvents;
import Base.BaseLayoutData;
import Base.BaseListener;
import lombok.Data;

@Data
public class Button {
    private GeneralButton general;
    private BaseLayoutData layoutData;
    private PresentationButton presentation;
    private BaseListener listener;
    private BaseEvents events;
}
