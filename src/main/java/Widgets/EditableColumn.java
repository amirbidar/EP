package Widgets;

import Attributes.EditableColumn.DataEditableColumn;
import Attributes.EditableColumn.EditorEditableColumn;
import Attributes.EditableColumn.GeneralEditableColumn;
import Attributes.EditableColumn.PresentationEditableColumn;
import lombok.Data;


@Data
public class EditableColumn {
    private GeneralEditableColumn general;
    private PresentationEditableColumn presentation;
    private DataEditableColumn data;
    private String EditorType;
    private EditorEditableColumn editorEditableColumn;




    // editor ->

    // TODO: 10/19/2020 Ask Editor

}

