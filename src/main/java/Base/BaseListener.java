package Base;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import Enum.*;
import java.util.List;
@Data
public class BaseListener {
    private EnumsDecleration.ListenerPhaseAction phase;
    private String action;
    private String condition;

/*@Data
     class Phase{

    }*/


}
