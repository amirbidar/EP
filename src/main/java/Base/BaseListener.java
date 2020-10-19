package Base;

import lombok.Data;

import java.util.List;
@Data
public class BaseListener {
    List<Phase> listeners;




@Data
     class Phase{
        private String phaseName;
        private String phaseAction;
        private String condition;
    }


}
