package Base;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BaseEntities {

    private String name;
    private String id;
    private String label;
    private String value;
    private Boolean editable;
    List<EntityProperties> property=new ArrayList<>();

}

