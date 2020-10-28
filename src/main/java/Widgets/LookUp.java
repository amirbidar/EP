package Widgets;

import Attributes.LookUp.*;
import Base.*;
import lombok.Data;

@Data
public class LookUp {
    private GeneralLookUp general;
    private LayoutData layoutData;
    private PresentationLookUp presentation;
    private BaseEntities enitites;
    private DataLookUp data;
    private ColumnsLookUp columns;
    private BasePagination pagination;
    private BaseConverter converter;
    private BaseListener listener;
    private EventLookUp events;
    private BaseValidation validation;



}
