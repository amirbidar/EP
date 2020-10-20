package Widgets;

import Attributes.Currency.EventCurrency;
import Attributes.TextField.DataTextField;
import Attributes.TextField.GeneralTextField;
import Base.*;
import lombok.Data;

@Data
public class TextField {

    private GeneralTextField generalTextField;

    private BaseLayoutData baseLayoutData;

    private BasePresentation basePresentation;

    private DataTextField dataTextField;

    private BaseConverter baseConverter;

    private BaseListener baseListener;

    private EventCurrency baseEvents;

    private BaseValidation baseValidation;


}
