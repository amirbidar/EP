package Base;

import lombok.Data;

import java.util.List;
@Data
public class BaseEvents {
    List<events> events;

    @Data
    class events{
        private String type;
        private String name;
        private String submitRegion;
        private String renderer;
        private String phase;
        private String environment;
        private String language;
        private String action;
        private CallBack callBack;
        private Arguments arguments;
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
