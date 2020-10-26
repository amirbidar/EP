package Widgets;

import Attributes.TextArea.GeneralTextArea;
import Attributes.TextField.DataTextField;
import Base.BaseConverter;
import Base.BaseLayoutData;
import Base.BaseListener;
import Base.BasePresentation;
import lombok.Data;

@Data
public class TaskComment {
private GeneralTextArea general;
private BaseLayoutData layoutData;
private BasePresentation presentation;
private DataTextField data;
private BaseConverter converter;
private BaseListener listener;

}
