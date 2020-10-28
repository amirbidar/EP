package Attributes.Composite;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class Children {
 /*   @JsonProperty("checkbox-group")
    public CheckboxGroup checkboxGroup;*/
    public List<Hidden> hidden;
    /*@JsonProperty("radio-group")
    public RadioGroup radioGroup;*/
// TODO: 10/28/2020 write all widgets

}
