package Attributes.DynamicRadio;

import Base.*;
import lombok.Data;

@Data
public class DynamicRadioItemFinder {
    private DynamicRadioItemFinderGeneral general;
    private DynamicRadioItemFinder itemFinder;
    private DynamicRadioItemFinderData data;
    private BasePresentation presentation;
    private BaseEvents events;
    private BaseValidation validators;
    private BaseListener listener;
    private BaseConverter converter;
    private BaseLayoutData layoutData;

    @Data
    class DynamicRadioItemFinderGeneral{
        private String name;
        private String label;
        private String toolTip;
    }
    @Data
    class DynamicRadioItemFinderData{
        private String variable;
        private String finder;
        private String condition;
        private String value;
        private String selected;
    }
}