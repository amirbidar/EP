package Widgets;

import Attributes.Frame.FrameGeneral;
import Base.*;
import lombok.Data;

@Data
public class Frame {
    private FrameGeneral general;
    private BasePresentation presentation;
    private BaseEvents events;
}
