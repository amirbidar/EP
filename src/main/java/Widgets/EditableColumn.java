package Widgets;

import Attributes.EditableColumn.DataEditableColumn;
import Attributes.EditableColumn.GeneralEditableColumn;
import Attributes.EditableColumn.PresentationEditableColumn;
import Attributes.EditableTable.GeneralEditableTable;
import com.sun.xml.internal.bind.v2.TODO;
import lombok.Data;

import java.util.List;

@Data
public class EditableColumn {
    private GeneralEditableColumn general;
    private PresentationEditableColumn presentation;
    private DataEditableColumn data;
    private String EditorType;
    // TODO: 10/19/2020 Ask Editor

}

