package Widgets;

import Base.BaseEvents;
import Base.BaseListener;
import Attributes.Currency.CurrencyData;
import Attributes.Currency.CurrencyGeneral;
import Attributes.Currency.CurrencyPresentation;
import lombok.Data;

@Data
public class Currency {
    private CurrencyGeneral general;
    private CurrencyPresentation presentation;
    private CurrencyData data;
    private BaseListener listener;
    private BaseEvents events;
}
