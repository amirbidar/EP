package Base;

import Attributes.Composite.Hidden;
import WidgetJson.*;
import WidgetJson.Button;
import WidgetJson.Composite;
import WidgetJson.Frame;
import WidgetJson.Image;
import WidgetJson.Label;
import WidgetJson.TextField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.awt.*;
import java.util.List;
@Data
public class Children {
    public Button button;
    public Captcha captcha;
    @JsonProperty("checkbox-group")
    public CheckBoxGroup checkBoxGroup;
    @JsonProperty("composite")
    public Composite composite;
    @JsonProperty("checkbox")
    public CheckBoxItem checkBoxItem;
    public Currency currency;
    @JsonProperty("datepicker")
    public DatePicker datePicker;
    public DynamicComboBox dropdown;
    @JsonProperty("dynamic-widget")
    public DynamicWidget dynamicWidget;
    @JsonProperty("editable-grid")
    public EditableGrid editableGrid;
    @JsonProperty("file-upload")
    public FileUpload fileUpload;
    public Frame frame;
    public Grid grid;
    public Image image ;
    public Label label;
    public Link link;
    public Lookup lookup;
    @JsonProperty("password-field")
    public PasswordField passwordField;
    @JsonProperty("radio-group")
    public RadioGroup radioGroup;
    @JsonProperty("radio")
    public RadioItem radioItem;
    public StaticList list;
    public TabFolder tabFolder;
    //public TaskComment taskComment;
    @JsonProperty("textarea")
    public TextArea textArea;
    @JsonProperty("textfield")
    public TextField textField;
  //  public TransitionCombo transitionCombo;
    public Tree tree;
    public List<Hidden> hidden;

// TODO: 10/28/2020 write all widgets

}
