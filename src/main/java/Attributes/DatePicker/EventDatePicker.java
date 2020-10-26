package Attributes.DatePicker;

import lombok.Data;

import java.util.List;
@Data
public class EventDatePicker {
    List<eventsDatePicker> events;

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
