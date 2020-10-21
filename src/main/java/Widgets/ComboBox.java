package Widgets;

import Attributes.Form.EventPopup;
import Attributes.StaticComboBox.EventComboBox;
import Attributes.StaticComboBox.ItemsComboBox;
import Attributes.StaticComboBox.PresentationComboBox;
import Base.*;
import lombok.Data;

import java.security.Principal;

@Data
public class ComboBox {
    private BaseGeneral_StaticWidgets general;
    private BaseLayoutData layoutData;
    private PresentationComboBox presentation;
    private BaseData data;
    private BaseConverter converter;
    private BaseListener listener;
    private EventComboBox events;
    private ItemsComboBox items;
    private BaseValidation validation;




}
