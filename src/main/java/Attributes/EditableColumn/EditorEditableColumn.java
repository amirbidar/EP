/*
package Attributes.EditableColumn;

import lombok.Setter;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
@Setter
public class EditorEditableColumn {

        public String type;

        public String getType() {
            return type;
        }

        public Object getObject(){
            Object main = null;
            List<Object> editortypes= new ArrayList<Object>();
            editortypes.add(new TextField());
            editortypes.add(new TextArea());
            editortypes.add(new PasswordField());
            editortypes.add(new DatePicker());
            editortypes.add(new dropdown());
            editortypes.add(new Checkbox());
            editortypes.add(new DynamicCombobox());
            editortypes.add(new DynamicCheckbox());
            editortypes.add(new CheckboxItem());
            editortypes.add(new RadioItem());
            for (Object o:editortypes) {
                if(o.getClass().getName().toLowerCase().contains(getType().toLowerCase())){
                    main=o;
                }
            }
            return main;

        }

}
*/
