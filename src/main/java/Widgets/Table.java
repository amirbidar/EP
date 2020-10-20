package Widgets;

import Attributes.Table.EventTable;
import Base.BaseEntities;
import Attributes.Table.GeneralTable;
import Base.BasePagination;
import Attributes.Table.TableData;
import Base.*;
import lombok.Data;

import java.util.List;

@Data
public class Table {
    private GeneralTable generalTable;
    private BaseLayoutData layoutData;
    private BasePresentation presentation;
    private BaseEntities enitites;
    private TableData data;
    private List<Column> colomnOrder;
    private BasePagination basePagination;
    private BaseListener baseListener;
    private EventTable events;
    private BaseValidation validation;


}
