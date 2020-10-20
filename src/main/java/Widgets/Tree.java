package Widgets;

import Attributes.Tree.*;
import Base.BaseListener;
import Base.BasePresentation;
import lombok.Data;

@Data
public class Tree {
    private TreeGeneral general;
    private BasePresentation presentation;
    private TreeColumnOrder columnOrder;
    private BaseListener listener;
    private EventTree events;
}
