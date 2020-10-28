package Widgets;

import Attributes.EditableTable.DataEditableTable;
import Attributes.EditableTable.EventEditableTable;
import Attributes.EditableTable.GeneralEditableTable;
import Attributes.EditableTable.PresentationEditableTable;
import Base.*;
import lombok.Data;

import java.util.List;

@Data
public class EditableTable {
    private GeneralEditableTable general;
    private LayoutData layoutData;
    private PresentationEditableTable presentation;
    private DataEditableTable data;
    private List<EditableColumn> columnOrder;
    private BaseConverter baseConverter;
    private BaseListener listener;
    private EventEditableTable events;
    private BaseValidation validation;
    private List<EditableColumn> children;

}
