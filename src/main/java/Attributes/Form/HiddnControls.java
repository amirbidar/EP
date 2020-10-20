package Attributes.Form;

import Base.BaseConverter;
import Base.BaseListener;
import lombok.Data;

import java.util.List;
@Data
public class HiddnControls {


    List<MControls> hiddenControllers;
    

@Data
    class MControls{
        private String name;
        private String query;
        private BaseConverter converter;
        private BaseListener listeners;
    }


}
