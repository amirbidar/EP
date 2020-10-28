package Widgets;

import Attributes.PasswordField.DataPasswordField;
import Attributes.PasswordField.EventPasswordField;
import Attributes.PasswordField.GeneralPasswordField;
import Attributes.PasswordField.PresentationPasswordField;
import Base.*;
import lombok.Data;

@Data
public class PasswordField {
    private GeneralPasswordField general;
    private LayoutData layoutData;
    private PresentationPasswordField presentation;
    private DataPasswordField data;
    private BaseConverter converter;
    private BaseListener listener;
    private EventPasswordField events;
    private BaseValidation validation;
}
