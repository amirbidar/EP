package Attributes.StaticComboBox;

import lombok.Data;

import java.util.List;
@Data
public class EventComboBox {
    private String eventName;
    List<eventsComboBox> eventsComboBox;

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
