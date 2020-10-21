package Attributes.PasswordField;

import Attributes.LookUp.EventLookUp;
import lombok.Data;

import java.util.List;
@Data
public class EventPasswordField {
    private String eventName;
    List<events> events;
    @Data
    class events{
        private Enum.Enums.CurrencyEvent type;
        private String name;
        private String submitRegion;
        private String renderer;
        private Enum.Enums.EventPhase phase;
        private Enum.Enums.Environment environment;
        private Enum.Enums.Language language;
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