package Base;

import lombok.Data;
import Enum.*;
import java.util.List;
@Data
public class BaseListener {
    List<Phase> listeners;




@Data
     class Phase{
        private EnumsDecleration.ListenerPhaseAction phaseName;
        private String phaseAction;
        private String condition;
    }


}
