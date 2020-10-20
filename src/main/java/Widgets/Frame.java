package Widgets;

import Attributes.Frame.EventFrame;
import Attributes.Frame.FrameGeneral;
import Base.*;
import lombok.Data;

@Data
public class Frame {
    private FrameGeneral general;
    private BasePresentation presentation;
    private EventFrame events;
}
