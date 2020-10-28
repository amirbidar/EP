package Widgets;

import Attributes.Table.*;
import Base.BasePagination;
import Base.*;
import Enum.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class grid {
    private String label;
    @JacksonXmlProperty(localName = "selection-mode")
    private EnumsDecleration.TableSelectionMode selectionMode;
    private String header;
    private String name;
    private String fullpath;
    private Boolean enabled;
    private Boolean layoutable;
    private Boolean rendered;
    private Boolean visible;
    @JacksonXmlProperty(localName = "default-page-size")
    private Integer defaultPageSize;
    @JacksonXmlProperty(localName = "enable-sort")
    private Boolean enableSort;

    @JacksonXmlProperty(localName = "layout-data")
    private LayoutData layoutData;

    List<eventsTable> events=new ArrayList<>();

    private List<BaseListener> listeners=new ArrayList<>();

    private List<Validations> validators =new ArrayList<>();

    @JacksonXmlProperty(localName = "pagination-bar")
    private BasePagination paginationBar;

    private List<ColumnModel> columns=new ArrayList<>();

    private TableData data;

    // TODO: 10/21/2020 ask about children also editable one


}
