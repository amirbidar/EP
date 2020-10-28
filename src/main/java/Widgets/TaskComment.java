package Widgets;

import Attributes.TextArea.GeneralTextArea;
import Attributes.TextField.DataTextField;
import Base.BaseConverter;
import Base.LayoutData;
import Base.BaseListener;
import Base.BasePresentation;
import lombok.Data;

@Data
public class TaskComment {
private GeneralTextArea general;
private LayoutData layoutData;
private BasePresentation presentation;
private DataTextField data;
private BaseConverter converter;
private BaseListener listener;

}
