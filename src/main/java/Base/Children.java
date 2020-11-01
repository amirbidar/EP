package Base;

import Attributes.Composite.Hidden;
import WidgetJson.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class  Children {
    public List<Form> form;
    public List<Button> button;
    public List<Captcha> captcha;
    @JsonProperty("checkbox-group")
    public List<CheckBoxGroup> checkBoxGroup;
    @JsonProperty("composite")
    public List<Composite> composite;
    @JsonProperty("checkbox")
    public List<CheckBoxItem> checkBoxItem;
    public List<Currency> currency;
    @JsonProperty("datepicker")
    public List<DatePicker> datePicker;
    public List<DynamicComboBox> dropdown;
    @JsonProperty("dynamic-widget")
    public List<DynamicWidget> dynamicWidget;
    @JsonProperty("editable-grid")
    public List<EditableGrid> editableGrid;
    @JsonProperty("file-upload")
    public List<FileUpload> fileUpload;
    public List<Frame> frame;
    public List<Grid> grid;
    public List<Image> image ;
    public List<Label> label;
    public List<Link> link;
    public List<Lookup> lookup;
    @JsonProperty("password-field")
    public List<PasswordField> passwordField;
    @JsonProperty("radio-group")
    public List<RadioGroup> radioGroup;
    @JsonProperty("radio")
    public List<RadioItem> radioItem;
    public List<StaticList> list;
    @JsonProperty("tab-folder")
    public List<TabFolder> tabFolder;
    //public TaskComment taskComment;
    @JsonProperty("textarea")
    public List<Textarea> textArea;
    @JsonProperty("textfield")
    public List<TextField> textField;
  //  public TransitionCombo transitionCombo;
    public List<Tree> tree;
    public List<Hidden> hidden;

// TODO: 10/28/2020 write all widgets

}
