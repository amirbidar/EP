package Base;

import Attributes.Composite.Children;
import Attributes.EditableTable.CellEditorComponents.Layout;
import Attributes.Form.*;
import Attributes.Frame.EventFrame;
import Attributes.Label.Listeners;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class Form {

    @JsonProperty("client-side-language")
    public String clientSideLanguage;
    public BaseValidation validators;
    public String title;
    public Boolean enabled;
    @JsonProperty("xmlns:xsd")
    public String xmlnsXsd;
    public String xmlns;
    public Boolean draggable;
    public Children children;
    @JsonProperty("x-position")
    public String xPosition;
    public EventAll events;
    public String height;
    public Boolean visible;
    public RefForms refForms;
    public Listeners listeners;
    public Boolean resizable;
    public Boolean layoutable;
    public Popups popups;
    public Resources resources;
    public String label;
    @JsonProperty("y-position")
    public String yPosition;
    public Integer version;
    public Layout layout;
    public Boolean rendered;
    public String name;
    public String width;
}
