package Widgets;

import Attributes.LookUp.ColumnsLookUp;
import Attributes.LookUp.DataLookUp;
import Attributes.LookUp.GeneralLookUp;
import Attributes.LookUp.PresentationLookUp;
import Base.*;
import javafx.scene.control.Pagination;
import lombok.Data;

@Data
public class LookUp {
    private GeneralLookUp general;
    private BaseLayoutData layoutData;
    private PresentationLookUp presentation;
    private BaseEntities enitites;
    private DataLookUp data;
    private ColumnsLookUp columns;
    private BasePagination pagination;
    private BaseConverter converter;
    private BaseListener listener;
    private BaseEvents events;
    private BaseValidation validation;



}
