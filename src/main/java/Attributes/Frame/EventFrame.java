package Attributes.Frame;

import Attributes.Button.EventButton;
import lombok.Data;
import Enum.*;

import java.util.List;
@Data
public class EventFrame {

    private String eventName;
    List<events> events;
    @Data
    class events{
        private EnumsDecleration.EventTypeLabel type;
        private String name;
        private String submitRegion;
        private String renderer;
        private EnumsDecleration.EventPhase phase;
        private EnumsDecleration.Environment environment;
        private EnumsDecleration.Language language;
        private String action;
        private CallBack callBack;
        private List<Arguments> arguments;
    }
    @Data
    class CallBack{
        private String onSuccess;
        private String fireCondition;
        private String before;
        private String condition;
    }
    @Data
    class Arguments{
        List<MArgument> arguments;

    }
    @Data
    class MArgument{
        private String name;
        private String value;
    }
}
