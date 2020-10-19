package Widgets;

import Attributes.Column.ColumnGeneral;
import Attributes.Column.DataColumn;
import Attributes.Column.PresentationColumn;
import lombok.Data;

@Data
public class Column {
private ColumnGeneral general;
private PresentationColumn presentation;
private DataColumn data;

}
