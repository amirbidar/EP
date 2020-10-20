package Widgets;

import Attributes.PasswordField.DataPasswordField;
import Attributes.PasswordField.GeneralPasswordField;
import Attributes.PasswordField.PresentationPasswordField;
import Base.*;
import lombok.Data;

@Data
public class PasswordField {
    private GeneralPasswordField general;
    private BaseLayoutData layoutData;
    private PresentationPasswordField presentation;
    private DataPasswordField data;
    private BaseConverter converter;
    private BaseListener listener;
    private BaseEvents events;
    private BaseValidation validation;
}
